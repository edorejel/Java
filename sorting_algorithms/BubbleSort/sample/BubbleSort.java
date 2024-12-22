package bubbleSort.Sample;
/*
at a minimum, a deep understanding of bubble sort should be acquired by the end of a typical semester course in algorithms and data structures
*/
public class BubbleSort {
	
	public static void bubbleSort(int[] arrayRefVarParam) {
		
		boolean needNextPass = true;
		
		for (int outerLoop = 1; outerLoop < arrayRefVarParam.length && needNextPass; outerLoop++) {
			
			needNextPass = false;
			
			for (int innerLoop = 0; innerLoop < arrayRefVarParam.length - outerLoop; innerLoop++)
				
				if (arrayRefVarParam[innerLoop] > arrayRefVarParam[innerLoop + 1] ) {
					
					int temp = arrayRefVarParam[innerLoop];
					arrayRefVarParam[innerLoop] = arrayRefVarParam[innerLoop + 1];
					arrayRefVarParam[innerLoop + 1] = temp;
					
					needNextPass = true;
			}
		}
	}
}
