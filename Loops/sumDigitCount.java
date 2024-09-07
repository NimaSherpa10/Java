package Loops;

import java.util.Scanner;

public class sumDigitCount {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int n = Math.abs(number); //making it positive
      
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            int lastDigit = i % 10;
            sum += lastDigit;
        }

        System.out.println("The sum of digits >>> " + sum);

        scanner.close();
    }
}
