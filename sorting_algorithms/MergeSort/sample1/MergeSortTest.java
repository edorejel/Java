package mergeSort.Sample1;

public class MergeSortTest {
	
	public static void main(String[] args) {
        int[] numbers = {10, 2, 78, 4, 45, 32, 7, 11};
        int NUMBERS_SIZE = numbers.length;

        System.out.println("UNSORTED:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call the mergeSort function to sort the array
        MergeSort.mergeSort(numbers, 0, NUMBERS_SIZE - 1);

        System.out.println("SORTED:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
	
