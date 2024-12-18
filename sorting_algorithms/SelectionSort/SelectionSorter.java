package selectionSort.sample;

public class SelectionSorter {//begin class
  
  public static void sort(int[] arrayRefVarPara) {//begin method sort
    for (int iniVar = arrayRefVarPara.length - 1; iniVar > 0; iniVar--) {//begin for
      int maxPos = maximumPosition(arrayRefVarPara, 0, iniVar);
      swap(arrayRefVarPara, maxPos, iniVar);
    }//end for
  }//end sort method

  
  private static int maximumPosition(int[] arrayRefVarPara, int from, int to) {//begin method
    int maxPos = from;
    for (int iniVar = from; iniVar <= to; iniVar++) {//begin for
      if (arrayRefVarPara[iniVar] > arrayRefVarPara[maxPos]) {
        maxPos = iniVar;
      }
    }//end for
    return maxPos;
  }//end method

  
  /* problem with Java is that descriptive identifier variable names are not necessarily enforced
   * try to discourage single letter variable identifiers because they are not helpful at all
   * fail the assignment automatically with no re-do option, if single letter identifiers are used for variables, including parameters
   * 
   */
  private static void swap(int[] arrayRefVar, int firstVal, int secondVal) {//begin swap method
    int temp = arrayRefVar[firstVal];
    arrayRefVar[firstVal] = arrayRefVar[secondVal];
    arrayRefVar[secondVal] = temp;
  }//end swap method
}//end class
