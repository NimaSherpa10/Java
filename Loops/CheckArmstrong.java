package Loops;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int result = 0;
        int numberOfDigits = 0;
        for (int temp = num; temp != 0; temp /= 10) {
            numberOfDigits++;
        }
        for (int temp = num; temp != 0; temp /= 10) {
            int digit = temp % 10;  
            result += Math.pow(digit, numberOfDigits); 
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
