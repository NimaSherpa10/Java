package Arrays;

import java.util.Arrays;

/**
 * 15) Write a Java program to find the k smallest elements in a given array. 
 * Elements in the array can be in any order
 * 
 */

public class kSmallestElements {
    public static void main(String[] args) {
        int [] array = {111,22,33,44,25,16,17};
        int k = 3;
        System.out.println(Arrays.toString(array));
        int[] ksmallest = ksmallest(array, k);
        System.out.println("The k largest elements are : 'k' == " + k + " elements == " + Arrays.toString(ksmallest));

    }

    /**
     * Helper funtion to sort the array in ascending order
     * @param array
     * 
     */
    public static void sortArray(int[] array) {
        int size = array.length;
        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - 1 - i; j++) {
                if(array[j]  > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int [] ksmallest(int [] array, int k) {
        int [] temp = new int[k];
        sortArray(array);
        for(int i = 0; i < k; i++) {
            temp[i] = array[i];
        }
        return temp;
    }


}
