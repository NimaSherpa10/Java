package practice;

class SumThread extends Thread {
    private int a;
    private int b;
    private int sum;

    public SumThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        sum = a + b;
        System.out.println("Sum --> " + sum);
    }

    public int getSum() {
        return sum;
    }
}

class FactorialThread extends Thread {
    private int number;
    private int factorial;

    public FactorialThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " --> " + factorial);
    }
}

public class ThreadJoinExample {

    public static void main(String[] args) {
        // Create the sum thread
        SumThread sumThread = new SumThread(5, 10);
        sumThread.start();

        try {
            // Wait for the sum thread to complete
            sumThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After the sum is calculated, retrieve the sum and create the factorial thread
        int sumResult = sumThread.getSum();
        FactorialThread factorialThread = new FactorialThread(sumResult);
        factorialThread.start();

        try {
            // Wait for the factorial thread to complete
            factorialThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
