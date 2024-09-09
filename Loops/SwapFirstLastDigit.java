package Loops;


import java.util.Scanner;

public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive number:");
        int num = sc.nextInt();

        if(num < 10) {
            System.out.println("Please enter a positive number greather than 10");
            return;
        }
        else {
            int last_digit = num % 10;
            int first_digit = 0;
            int digit_count = 0;
            for(int i = num; i > 0; i /= 10) {
                if(i < 10) {
                    first_digit = i;
                   
                }
                digit_count ++;
            }
            int middle_part = (num % (int) Math.pow(10, digit_count - 1)) / 10;
            int swapped_num = (last_digit * (int) Math.pow(10, digit_count - 1)) + (middle_part * 10) + first_digit;

            System.out.println("Original number: " + num);
            System.out.println("Number after swapping first and last digit: " + swapped_num);
        }

            
        }
    }

