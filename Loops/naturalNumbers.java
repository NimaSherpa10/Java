package Loops;
import java.util.Scanner;

public class naturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        printNumbers(n);
        sc.close();
    }


    public static void printNumbers(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i == n) {
                    System.out.print(i); 
                } else {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
