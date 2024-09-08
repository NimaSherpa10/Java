package Loops;
import java.util.Scanner;

public class checkStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = sc.nextInt();
        if( n <= 0) {
            System.out.println("Please enter a positive number greater than zero.");
        }
        else {
            int sum = 0;
            for(int i = n; i > 0; i/=10) {
                int last_digit = i % 10;
                int factorial = 1;
                for(int j = last_digit; j >= 1; j--) {
                    factorial *= j;
                }
                sum += factorial;
            }
            if(sum == n) {
                System.out.println("The given number is strong number");
            }
            else{
                System.out.println("The given number is not strong number");
            }
        }
    }
}
