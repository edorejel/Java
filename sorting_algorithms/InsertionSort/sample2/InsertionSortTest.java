package insertionSort.sample2;

import java.util.Arrays;

public class InsertionSortTest {
		
	public static void main(String[] args) {
		
		int[] arrayRefVar = {1, 9, 4, 6, 5, -4 };
		
		System.out.println(Arrays.toString(arrayRefVar));
		InsertionSort.insertionSort(arrayRefVar);
		System.out.println(Arrays.toString(arrayRefVar));
	}
}
