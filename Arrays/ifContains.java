package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ifContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array you want to create >>> ");
        int size = sc.nextInt();

        int [] array = new int [size];

        for(int i = 0; i < size; i++) {
            System.out.println("Please enter the elements of the array >>>");
            array[i] = sc.nextInt();
        }

        System.out.println("The Given Array is >> " + Arrays.toString(array));

        //ask user for the value he/she wants to find.
        System.out.println("Please enter the value you want to check on the Array >>> ");
        int value = sc.nextInt();

        boolean check = false;
        for(int i = 0; i < size; i++) {
            if(array[i] == value) {
                check = true;
                break;

            }
        }
        if(check) {
            System.out.println("The given array contains the value");
        }
        else {
            System.out.println("The given array does not contains the value");
        }
        sc.close();
    }    
}
