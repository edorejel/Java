package selectionSort.sample;

import java.util.Arrays;

public class SelectionSortTest {

	public static void main(String[] args) {
		
		int[] arrayRefVar = new int[] {24, 19, 79, 97, 52, 68, 27, 49, 86, 31};
		System.out.println(Arrays.toString(arrayRefVar));
		long startTime = System.nanoTime();
		SelectionSorter.sort(arrayRefVar);
		long stopTime = System.nanoTime();
		long totalDuration = (stopTime - startTime);
		System.out.println(Arrays.toString(arrayRefVar));
		System.out.println();
		System.out.println(totalDuration + " nano seconds ");
	}
}
