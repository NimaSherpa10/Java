package Arrays;

import java.util.Arrays;

/**
 * 16) Swap two array with tempary variable.
 */
public class SwapArrays {
    public static void main(String[] args) {
        // Initial arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30, 40, 50};
    
        System.out.println("Before swapping:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        
        int[] temp = array1;
        array1 = array2;
        array2 = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }
}
