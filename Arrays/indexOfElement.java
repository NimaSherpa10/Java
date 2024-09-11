package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class indexOfElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array you want to create >>> ");
        int size = sc.nextInt();

        int [] array = new int [size];

        for(int i = 0; i < size; i++) {
            System.out.println("Please enter the elements of the array >>>");
            array[i] = sc.nextInt();
        }


        //ask user for the value he/she wants to find.
        System.out.println("Please enter the value you want to check the index of on the Array >>> ");
        int value = sc.nextInt();

       int index = -1;
        for(int i = 0; i < size; i++) {
            if(array[i] == value) {
                index = i;
                break;

            }
        }
        System.out.println("The Given Array is >> " + Arrays.toString(array));
        if(index != -1) {
            System.out.println("The index of the given value is >>> " + index);
        }
        else{
            System.out.println("The value is not found on the array");
        }
    }
}
