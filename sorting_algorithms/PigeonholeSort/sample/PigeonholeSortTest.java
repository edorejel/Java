package pigeonholeSort.sample;

import java.util.Arrays;

public class PigeonholeSortTest {//begin class

	public static void main(String[] args) {
        
		int[] arrayRefVar = new int[]{8, 3, 2, 7, 4, 6, 8};
        
		System.out.println("Original Array: " + Arrays.toString(arrayRefVar));

        PigeonholeSort.pigeonholeSort(arrayRefVar);

        System.out.println("Sorted Array: " + Arrays.toString(arrayRefVar));
    }
}//end class
	
	
