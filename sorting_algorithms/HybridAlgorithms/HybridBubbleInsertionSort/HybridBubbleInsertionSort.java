package hybridBubbleInsertionSort.sample1;

public class HybridBubbleInsertionSort {

	    // Main sorting method
	    public static void hybridBubbleInsertionSort(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            boolean swapped = false;

	            // Bubble Sort pass
	            // This loop runs fewer iterations as 'i' increases because each iteration places the largest unsorted element at the end of the array.
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    swap(arr, j, j + 1);
	                    swapped = true;
	                }
	            }

	            // Apply Insertion Sort for sorted elements in the left half
	            // This loop reinforces the sorting done by Bubble Sort, ensuring that the left portion remains correctly ordered.
	            // The time complexity of this Insertion Sort pass is O(n^2) in the worst case but can be as efficient as O(n) when the array is nearly sorted.
	            for (int k = 0; k < i; k++) {
	                int key = arr[k + 1];
	                int m = k;
	                while (m >= 0 && arr[m] > key) {
	                    arr[m + 1] = arr[m];
	                    m--;
	                }
	                arr[m + 1] = key;
	            }

	            // Exit early if no swaps were made
	            if (!swapped) break;
	        }
	    }

	    // Swap helper method
	    // This method swaps two elements in the array, improving code reuse and readability by encapsulating the swapping logic.
	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }	   
	}
