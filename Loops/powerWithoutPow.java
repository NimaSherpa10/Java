package Loops;
import java.util.Scanner;

public class powerWithoutPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the base integer >>>");
        int base = sc.nextInt();

        System.out.println("Please enter the power for the int >>>>");
        int pow = sc.nextInt();

        int result = 1;
        for(int i = 1; i <= pow; i++) {
            result *= base;
        }

        System.out.println("The base is " + base + " and the exponent is " + pow + " and the result is >>> " + result);
        System.out.println();
    }
}
