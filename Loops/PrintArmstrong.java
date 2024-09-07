package Loops;

import java.util.Scanner;

public class PrintArmstrong {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the upper limit (n): ");
        int n = sc.nextInt();

        System.out.println("Armstrong numbers between 1 and " + n + " are:");
        for (int num = 1; num <= n; num++) {
            int originalNum = num;
            int result = 0;
            int numberOfDigits = 0;

            // Calculate the number of digits in the number
            for (int temp = num; temp != 0; temp /= 10) {
                numberOfDigits++;
            }

            // Calculate the sum of each digit raised to the power of numberOfDigits
            for (int temp = num; temp != 0; temp /= 10) {
                int digit = temp % 10;  // Extract the last digit
                result += Math.pow(digit, numberOfDigits);  // Raise digit to the power of numberOfDigits
            }

            // Check if the result is equal to the original number
            if (result == originalNum) {
                System.out.print(originalNum + " ");
            }
        }
    }
}
