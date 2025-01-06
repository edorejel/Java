package hybridBubbleInsertionSort.sample1;

public class HybridBubbleInsertionSortTest {
	
	 // Main method for testing
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(arr); // Prints the array before sorting for testing and debugging purposes

        HybridBubbleInsertionSort.hybridBubbleInsertionSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr); // Prints the sorted array to verify the result
    }

    // Utility method to print an array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
