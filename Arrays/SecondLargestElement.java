package Arrays;
import java.util.Arrays;
//Question 11) Write a Java program to find the second largest element in an array.

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] array = new int [] {1,3,6,10,13,35,34};
        int SecondLargestElement = SecondLargest(array);

        System.out.println(Arrays.toString(array));

        if(SecondLargestElement != -1) {
            System.out.println("The second largest element on the array is " + SecondLargestElement);
        }
        else{
            System.out.println("There is no second largest element in the array.");
        }
    }

    //returns the second largest element
    public static int SecondLargest(int[]array) {
        int size = array.length;
        int max = array[0];
        int secondMax = array[0];
        if(size < 2) {
            return -1;
        }
        
        for(int i = 0; i < size; i++) {
            if(array[i] > max) {
                secondMax = max;
                max = array[i];
            }
            else if(array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        
        
        return secondMax;
    }
}
