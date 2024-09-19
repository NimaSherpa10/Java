package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 5, 6, 7, 8, 8, 9};

     
        int newSize = removeDuplicates(array);

        // Printing the array after removing duplicates
        for (int i = 0; i < newSize; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Method to remove duplicates and return the new size of the array
    public static int removeDuplicates(int[] array) {
        int n = array.length;
        
        // If the array is empty or has one element, return its size
        if (n == 0 || n == 1) {
            return n;
        }

        // Create a temporary array to store unique elements
        int[] temp = new int[n];
        int j = 0;

        // Traverse the original array
        for (int i = 0; i < n; i++) {
            // Check if the element is already in temp
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (array[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the element is not a duplicate, add it to temp
            if (!isDuplicate) {
                temp[j++] = array[i];
            }
        }

        // Copy the unique elements back to the original array
        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }

        // Return the size of the new array without duplicates
        return j;
    }
}
