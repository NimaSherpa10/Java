package Arrays;
/**
 * 19) Program to find the frequency of each element of an array
 */
public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 3, 1, 5, 6, 2};
        int size = array.length;

        System.out.println("Original Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Call the method to print frequencies
        findFrequency(array, size);
    }

    // Method to find the frequency of elements
    public static void findFrequency(int[] array, int size) {
        // Loop through the array
        for (int i = 0; i < size; i++) {
            // Skip already visited elements marked as -1
            if (array[i] == -1) {
                continue;
            }

            int count = 1; // Initialize count for current element
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                    // Mark visited elements
                    array[j] = -1;
                }
            }
            System.out.println("Element " + array[i] + " appears " + count + " times");
        }
    }
}
