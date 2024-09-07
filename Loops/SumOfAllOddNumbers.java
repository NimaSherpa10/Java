package Loops;

import java.util.Scanner;

public class SumOfAllOddNumbers {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        int result = Sum(n);
        System.out.println("The Sum of Odd number is : " + result);
        sc.close();
    }


    public static int Sum(int n) {
        int sum = 0;
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            for (int i = 1; i <= n; i++) {
                    if(i%2 != 0) {
                        sum += i;
                    }
            }
        }
        return sum;
    }
}
