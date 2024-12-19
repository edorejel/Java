package quickSort.Sample1;


public class QuickSort {

    // Partition method
    public static int partition(int[] numbers, int lowIndex, int highIndex) {
        // Pick middle element as pivot
        int midpoint = lowIndex + (highIndex - lowIndex) / 2;
        int pivot = numbers[midpoint];

        boolean done = false;
        while (!done) {
            // Increment lowIndex while numbers[lowIndex] < pivot
            while (numbers[lowIndex] < pivot) {
                lowIndex++;
            }

            // Decrement highIndex while pivot < numbers[highIndex]
            while (pivot < numbers[highIndex]) {
                highIndex--;
            }

            // If zero or one elements remain, then all numbers are partitioned
            if (lowIndex >= highIndex) {
                done = true;
            } else {
                // Swap numbers[lowIndex] and numbers[highIndex]
                int temp = numbers[lowIndex];
                numbers[lowIndex] = numbers[highIndex];
                numbers[highIndex] = temp;

                // Update lowIndex and highIndex
                lowIndex++;
                highIndex--;
            }
        }

        return highIndex;
    }

    // Quicksort method
    public static void quicksort(int[] numbers, int lowIndex, int highIndex) {
        // Base case: If the partition size is 1 or zero, it's already sorted
        if (lowIndex >= highIndex) {
            return;
        }

        // Partition the array and get the pivot index
        int lowEndIndex = partition(numbers, lowIndex, highIndex);

        // Recursively sort the left and right partitions
        quicksort(numbers, lowIndex, lowEndIndex);
        quicksort(numbers, lowEndIndex + 1, highIndex);
    }

}
