package mergeSort.sample;

public class MergeSort {//begin class
	
	/*
	 * 
	 * disallow use of single letter identifier variable names when first learning Merge Sort
	 * fail any assignments that use single letter identifier variable names when first learning Merge Sort
	 * fail any assignment that uses a single letter identifier for all variables and object reference variables
	 */
	
	/*
	 * fail any assignment, unless properly indicated, that is, explicitly indicated, with a proper identifier, when an array is passed through a parameter
	 * 
	 */
	public static void sort(int[] arrayRefVarPara) {//begin sort method
	
		if (arrayRefVarPara.length <= 1) {//understand the deeper meaning here (don't just repeat the code)		 								
			return;
		}
		
		int[] firstHalfFromParaArray = new int[arrayRefVarPara.length/2];//understand the deeper meaning here (don't just repeat the code)
		int[] secondHalfFromParaArray = new int[arrayRefVarPara.length - firstHalfFromParaArray.length];//what is happening here exactly?
		
		for (int firstArrayHalfPara = 0; firstArrayHalfPara < firstHalfFromParaArray.length; firstArrayHalfPara++) {//begin for
			
			firstHalfFromParaArray[firstArrayHalfPara] = arrayRefVarPara[firstArrayHalfPara];
			
		}//end for
		
		for (int secondArrayHalf = 0; secondArrayHalf < secondHalfFromParaArray.length; secondArrayHalf++ ) {//begin for
			
			secondHalfFromParaArray[secondArrayHalf] = arrayRefVarPara[firstHalfFromParaArray.length + secondArrayHalf ];
			
		}//end for
		
		sort(firstHalfFromParaArray);//what is going on here? please explain.
		sort(secondHalfFromParaArray);//what is going on here? please explain.
		merge(firstHalfFromParaArray, secondHalfFromParaArray, arrayRefVarPara);
		
}//end sort method
	
	private static void merge(int[] firstArrayHalfPara, int[] secondArrayHalfPara, int[] arrayRefVarPara) {//does the system know which arrays are being passed, or do you tell the system, if so, how?
		
		int indexFirstArrayHalf = 0;
		int indexSecondArrayHalf = 0;
		int indexArrayRefVarPara = 0;
		
		
		while (indexFirstArrayHalf < firstArrayHalfPara.length && indexSecondArrayHalf < secondArrayHalfPara.length ) {//begin while
			
			if ( firstArrayHalfPara[indexFirstArrayHalf] < secondArrayHalfPara[indexSecondArrayHalf] ) {
				arrayRefVarPara[indexArrayRefVarPara] = firstArrayHalfPara[indexFirstArrayHalf];
				indexFirstArrayHalf++;
			} else {
				arrayRefVarPara[indexArrayRefVarPara] = secondArrayHalfPara[indexSecondArrayHalf];
				indexSecondArrayHalf++;
			}
			indexArrayRefVarPara++;
			
		}//end while
		
		/*
		 * copy any remaining entries of the first array - what does this imply about what happened with the entries in the previous while-loop,
		 * that is, why do we have remaining entries in the first place? Is this a security issue of some kind? do we have a data leak? please explain...
		 * 
		 */
		while (indexFirstArrayHalf < firstArrayHalfPara.length) {//begin while
			arrayRefVarPara[indexArrayRefVarPara] = firstArrayHalfPara[indexFirstArrayHalf];
			indexFirstArrayHalf++;
			indexArrayRefVarPara++;
		}//end while
		
		
		//copy any remaining entries of the second array
		/*
		 * 
		 * same as above, why are there remaining entries that we need to consider? does this imply that Java or Merge Sort are not secure? please explain...
		 */
		while (indexSecondArrayHalf < secondArrayHalfPara.length) {
			arrayRefVarPara[indexArrayRefVarPara] = secondArrayHalfPara[indexSecondArrayHalf];
			indexSecondArrayHalf++;
			indexArrayRefVarPara++;
		}
	}
}//end class
