package insertionSort.sample;

public class InsertionSort {//a class is a blueprint
/*
	 * 
	 * be able to trace out insertion sort's behavior with an array
	 * 
	 */
	public static void sort(int[] arrayRefVarPara) {//begin method
		/*
		 * descriptive identifiers appear more helpful to *track* the data flow
		 * 
		 * */
		for (int outerVar = 1; outerVar < arrayRefVarPara.length; outerVar++ ) {
			
				int next = arrayRefVarPara[outerVar];
				/*
				 * move all larger elements up
				 * 
				 */
				int innerVar = outerVar;
				/*
				 * be able to explain what is happening here, in the while-loop, in a meaningful way, not rote memorization
				 * 
				 */
				while (innerVar > 0 && arrayRefVarPara[innerVar - 1] > next) {//begin while
				arrayRefVarPara[innerVar] = arrayRefVarPara[innerVar - 1];//be able to explain this part, specifically, reading the code does not explain what is happening inside of the code
				innerVar--;
			}//end while
			arrayRefVarPara[innerVar] = next;
		}//end for
	}//end method sort
}//end class
