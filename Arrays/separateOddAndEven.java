/**
 * Question 13) Write a Java program to separate even and odd numbers of a
    given array of integers. Put all even numbers first, and then odd numbers.
 */


package Arrays;
import java.util.Arrays;

public class separateOddAndEven {
    public static void main (String[] args) {
        int[] array = {12, 17, 70, 15, 22, 65, 21, 90};

        System.out.println("The given array is  " + Arrays.toString(array) );
        array = separateEvenOdd(array);

        System.out.println("The array after separating even and odd ");
        System.out.println(Arrays.toString(array));

    }

    /**
     * 
     * @param array
     * @return newArray (separated even and odd)
     */

    public static int[] separateEvenOdd(int[] array) {
        int size  = array.length;
        int[] newArray = new int [size];
        int evenIndex = 0; //from the beginning
        int oddIndex = size - 1; //from the last
        
        for(int i = 0; i < size; i++) {
            if(array[i] % 2 == 0) {
                newArray[evenIndex++] = array[i];
            }
            else{
                newArray[oddIndex--] = array[i];
            }
        }
        
        return newArray;
    }
}
