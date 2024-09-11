package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class removeFromArray {
    public static void main(String[] args) {
        int [] array = new int[] {10,30,30,-1,2,4};

        //scanner for the input
        Scanner sc = new Scanner(System.in); 

        System.out.println("Here is the given Array >> " + Arrays.toString(array));

        System.out.println("Please enter the value you want to remove >>");
        int value = sc.nextInt();

        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                count++;
            }
        }
        
       
        if(count == 0) {
            System.out.println("The given vvalue is not found in array");

        }
        else{
            int [] newArray = new int[array.length - count];
            int index = 0;
            for(int i = 0; i < array.length; i++) {
                if(array[i] != value) {
                    newArray[index] = array[i];
                    index++;
                }
            }
            System.out.println("The array after removing value is >>>> " + Arrays.toString(newArray));
        }
    }

}
