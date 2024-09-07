package Loops;
import java.util.Scanner;
public class MultiplicationOfNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table:");
        int number = sc.nextInt();
        
        printMultiplicationTable(number);
        
        sc.close();
    }

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}


