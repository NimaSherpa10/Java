package Loops;

import java.util.Scanner;

public class PowerUsingPowMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the base:");
        int base = sc.nextInt();
        
        System.out.println("Enter the exponent:");
        int exponent = sc.nextInt();
        
        double result = 1;

        for (int i = 0; i < 1; i++) {
            result = Math.pow(base, exponent);
        }
        
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
