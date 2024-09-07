package Loops;
import java.util.Scanner;

public class printPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            System.out.println("Prime numbers up to " + num + " are:");

           
            for (int i = 2; i <= num; i++) {
                boolean isPrime = true;

               
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

             
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
