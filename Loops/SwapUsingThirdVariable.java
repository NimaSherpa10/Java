package Loops;

import java.util.Scanner;

public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter the first number (a):");
        int a = sc.nextInt();

        System.out.println("Enter the second number (b):");
        int b = sc.nextInt();

        
        for (int i = 0; i < 1; i++) {
          
            int temp = a;  
            a = b;       
            b = temp;      
        }

        // Display the swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
