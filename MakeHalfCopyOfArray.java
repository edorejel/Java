//copy half of an array, use as little code as possible to achieve the effect
/*
this also works, even less code
public static String[] copyHalf(String[] values){
       String[] copyOfStrings = Arrays.copyOf(values, values.length/2);
	    return copyOfStrings;
}
*/

import java.util.Arrays;

public class CopyHalf
{
   /**
      Copies the first half of an array. If the length is odd, 
      don't copy the middle value.
      @param values an array
      @return a copy of the first half of values
   */
   public static String[] copyHalf(String[] values)
   {
      String[] halfArray = new String[values.length/2];
        for (int i = 0; i < halfArray.length; i++) {
            halfArray[i] = values[i];
        }
        return halfArray;
   }
   
   public static void main(String[] args)
   {
      String[] arr1 = { "Mary", "had", "a", "little", "lamb" };
      System.out.println("Full Array 1: " + Arrays.toString(arr1));
      System.out.println("Half Array 1: " + Arrays.toString(copyHalf(arr1)));
      
      System.out.println();
      
      String[] arr2 = { "its", "fleece", "was", "white", "as", "snow" };
      System.out.println("Full Array 2: " + Arrays.toString(arr2));
      System.out.println("Half Array 2: " + Arrays.toString(copyHalf(arr2)));
   }
}
