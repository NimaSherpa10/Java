package Loops;
import java.util.Scanner;

public class reversePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number :");
        
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("please Enter a positive number greater than zero.");
        }
        else {
            for(int i = number; i >= 0; i--) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
