package quickSort.Sample1;

public class QuickSortTest {
	
	public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 2, 78, 4, 45, 32, 7, 11};
        int NUMBERS_SIZE = numbers.length;

        // Print unsorted array
        System.out.print("UNSORTED: ");
        for (int i = 0; i < NUMBERS_SIZE; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Perform Quicksort
        QuickSort.quicksort(numbers, 0, NUMBERS_SIZE - 1);

        // Print sorted array
        System.out.print("SORTED: ");
        
        for (int i = 0; i < NUMBERS_SIZE; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
