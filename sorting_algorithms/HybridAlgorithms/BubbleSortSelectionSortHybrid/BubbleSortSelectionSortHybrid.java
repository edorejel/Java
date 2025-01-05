package bubbleSortSelectionSortHybrid.sample1;

public class BubbleSortSelectionSortHybrid {


	    // Hybrid Sort: Selection + Bubble
	    public static void hybridSort(int[] array) {
	        int n = array.length;

	        // Step 1: Perform Selection Sort (finding minimum and placing it in correct position)
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            swap(array, i, minIndex);
	        }

	        // Step 2: Perform Bubble Sort (refining adjacent elements)
	        boolean swapped;
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    swap(array, j, j + 1);
	                    swapped = true;
	                }
	            }
	            if (!swapped) {
	                break; // Array is already sorted
	            }
	        }
	    }

	    // Utility method to swap two elements in an array
	    private static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	    
	    // Utility method to print the array
	   public static void printArray(int[] array) {
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }
	}
