package bubbleSortSelectionSortHybrid.sample1;

public class BubbleSortSelectionSortHybridTest {
	
	// Main method to test the hybrid sort
    public static void main(String[] args) {
    	
        int[] data = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        BubbleSortSelectionSortHybrid.printArray(data);

        BubbleSortSelectionSortHybrid.hybridSort(data);

        System.out.println("\nSorted Array:");
        BubbleSortSelectionSortHybrid.printArray(data);
    }
	
}
