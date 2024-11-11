public class ArrayTest {
	
	public static void main(String[] args) {
	
	int[] values = {82, 11, 15, 25, 17, 69, 61, 88, 80, 36};
	System.out.println();
	
	//1.
	/*for (int j = values.length - 1; j >= 0; j--){//prints the array backwards
		System.out.println(values[j]++);
		
	}*/
	
	//2. array index out of bounds
	/*for (int j = values.length; j > 0; j--){
		System.out.println(values[j]++);
	}*/
	
	
	
	//3 normal array iteration, does not add 1 to array values, skips the first value
	/*for (int j = 1; j < values.length - 1; j++){
		System.out.println(values[j]++);
	}*/
	
	//4 normal array interation
	/*for (int j = 0; j < values.length - 1; j++){
		System.out.println(values[j]++);
	}*/
	
	
	
	//5 normal array iteration
	/*for (int j = 0; j < values.length; j++){
		System.out.println(values[j]++);
		}*/
	
	
	
	//6 array index out of bounds 
	/*for (int j = values.length; j >= 0; j--){
		System.out.println(values[j]++);
		}*/
	
	
	//7 normal array iteration, starts at index 2 
	/*for (int j = 2; j < values.length; j++){
		System.out.println(values[j]++);
		}*/
	
	
	//8 array out of bounds
	/*for (int j = values.length + 1; j > 0; j--){
	 * values[j]++;}*/
	
	
	}
}
