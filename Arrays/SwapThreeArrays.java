package Arrays;

import java.util.Arrays;

public class SwapThreeArrays {
    public static void main(String[] args) {
       
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};

    
        System.out.println("Original array1: " + Arrays.toString(array1));
        System.out.println("Original array2: " + Arrays.toString(array2));
        System.out.println("Original array3: " + Arrays.toString(array3));

 
        swapArrays(array1, array2, array3);

       
        System.out.println("After swapping:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Array3: " + Arrays.toString(array3));
    }

    public static void swapArrays(int[] array1, int[] array2, int[] array3) {
        
        int[] temp = array1;

       
        array1 = array2;  
        array2 = array3;  
        array3 = temp;   

        System.out.println("Inside swapArrays method:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Array3: " + Arrays.toString(array3));
    }
}

