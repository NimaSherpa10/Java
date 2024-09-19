/**
 * 14) Write a Java program to find the k largest elements in a given
        array. Elements in the array can be in any order
 * 
 * 
 * 
 * We can solve this problem using 3 approaches.
 * 
 * 1>> Sorting array (O(n log n))
 * 2>> USing min-heap (O(n log k))
 * 3>> using Quickselect algorithm (O(n))  ---> worst Case O(n^2) if pivot selection is bad.
 * 
 * 
 * 
 * Below is simple first approach
 */


package Arrays;
import java.util.Arrays;



public class kLargestElement {
    public static void main(String[] args) {
        int [] array =  {12,234,31,42,5,6,123,1224};
        int k = 3;
        System.out.println(Arrays.toString(array));

        int [] k_largest_Array = k_largest_Array(array, k);

        System.out.println("The k largest elements are : 'k' == " + k + " elements == " + Arrays.toString(k_largest_Array));

    }

    /**
     * 
     * @param array
     * helper funtion to sort array in ascending order.
     */

    public static void sortArray(int[] array) {
        int size = array.length;
        
        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }



    /**
     * 
     * @param array
     * @param k
     * @return array of the k largest elements
     */

    public static int[] k_largest_Array(int[] array ,int k) {
        int [] kLargest = new int[k];
        sortArray(array);
        int size = array.length;
        for(int i = 0; i < k; i++) {
            kLargest[i] = array[size - k + i];
        }
        return kLargest;
    }
}
