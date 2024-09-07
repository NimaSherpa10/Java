package Loops;
import java.util.Scanner;
public class sumOfPrimeNum {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int num = sc.nextInt();
            if (num <= 1) {
                System.out.println("Please enter a number greater than 1.");
            } else {
    
                int sum = 0;
                for (int i = 2; i <= num; i++) {
                    boolean isPrime = true;
                   
                    for (int j = 2; j <= i / 2; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
    
                 
                    if (isPrime) {
                       sum += i;
                    }
                }
                System.out.println("The sum of the prime number is " + sum);
            }
    }
}
