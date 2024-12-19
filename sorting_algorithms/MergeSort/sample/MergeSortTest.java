package mergeSort.sample;

import java.util.Arrays;

import insertionSort.sample.ArrayUtil;

public class MergeSortTest {//begin class, a class is a "blueprint"
	
	public static void main(String[] args) {//begin main
	
		int[] arrayRefVarTest = ArrayUtil.randomIntArray(20, 100);
		
		System.out.println(Arrays.toString(arrayRefVarTest));
		
		MergeSort.sort(arrayRefVarTest);
		
		System.out.println(Arrays.toString(arrayRefVarTest));
			
	}//end main
	

}//end class
