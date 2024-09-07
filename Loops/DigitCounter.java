package Loops;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int n = Math.abs(number); //making it positive
      
        int digitCount = 0;

        for (int i = n; i > 0; i /= 10) {
            digitCount++;
        }

       
        if (number == 0) {
            digitCount = 1;
        }

        System.out.println("The number has " + digitCount + " digits.");

        scanner.close();
    }
}
