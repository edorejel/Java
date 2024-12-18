package insertionSort.sample;

import java.util.Arrays;

/**
   This program demonstrates the insertion sort algorithm.
*/
public class InsertionSortTest
{  
   public static void main(String[] args)
   {  
      int[] a = ArrayUtil.randomIntArray(20, 100);
      System.out.println(Arrays.toString(a));

      InsertionSort.sort(a);

      System.out.println(Arrays.toString(a));
   }
}
