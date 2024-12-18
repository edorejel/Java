package insertionSort.sample2;

public class InsertionSort {//a class is a blueprint
	
	
	public static void insertionSort(int[] arrayRefVarPara) {//begin method insertionSort
		
		
		for (int outerVar = 1; outerVar < arrayRefVarPara.length; outerVar++) {//begin outer for
			
			int currentElement = arrayRefVarPara[outerVar];
			
			int innerVar;
			
			for (innerVar = outerVar - 1; innerVar >= 0 && arrayRefVarPara[innerVar] > currentElement; innerVar-- ) {//begin for
				arrayRefVarPara[innerVar + 1] = arrayRefVarPara[innerVar];
				
			}//end for
			arrayRefVarPara[innerVar + 1] = currentElement;
		}//end outer for
			
	}//end method insertionSort
		
}//end class
