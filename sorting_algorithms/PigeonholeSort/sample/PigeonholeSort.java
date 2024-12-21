package pigeonholeSort.sample;

import java.util.*;

public class PigeonholeSort {//begin class

    public static void pigeonholeSort(int[] arrayRefVarParam) {
        // Step 1: Find the range of the array
        int min = Arrays.stream(arrayRefVarParam).min().getAsInt();
        int max = Arrays.stream(arrayRefVarParam).max().getAsInt();
        int range = max - min + 1;

        // Step 2: Create pigeonholes (bins)
        List<Integer>[] pigeonholes = new List[range];
        for (int iniVar = 0; iniVar < range; iniVar++) {
            pigeonholes[iniVar] = new ArrayList<>();
        }

        // Step 3: Place each element in its corresponding bin
        for (int num : arrayRefVarParam) {
            pigeonholes[num - min].add(num);
        }

        // Step 4: Reconstruct the sorted array
        int index = 0;
        for (List<Integer> hole : pigeonholes) {
            for (int num : hole) {
                arrayRefVarParam[index++] = num;
            }
        }
    }//end class

}//end class
