package bubbleSort.Sample;

public class BubbleSortTest {
 public static void main(String[] args) {
		int[] arrayRefVar = new int[] {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		BubbleSort.bubbleSort(arrayRefVar);
		for (int iniVar = 0; iniVar < arrayRefVar.length; iniVar++) {
			System.out.print(arrayRefVar[iniVar]);
		}
	}
}
