package Loops;
import java.util.Scanner;
public class printStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int num =  sc.nextInt();
        boolean isStrongNum;
        for(int i = 1; i <= num; i++ ) {
            isStrongNum = checkNumber(i);
            if(isStrongNum == true) {
                System.out.print(i + " ");
            }
        }


    }

    public static boolean checkNumber(int n) {
        int sum = 0;
        for(int i = n; i > 0; i /= 10 ) {
            int factorial = 1;
            int last_digit = i % 10;
            for(int j = 1; j <= last_digit; j++) {
                factorial *= j;
            }
            sum += factorial;
        }
        if(sum == n) {
            return true;
        }
        return false;
    }
}
