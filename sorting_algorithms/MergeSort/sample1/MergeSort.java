package mergeSort.Sample1;

public class MergeSort {
    
    // Merge function to merge two sorted partitions
    public static void merge(int[] numbers, int i, int j, int k) {
        int mergedSize = k - i + 1; // Size of merged partition
        int mergePos = 0;           // Position to insert merged number
        int leftPos = i;            // Position of elements in left partition
        int rightPos = j + 1;       // Position of elements in right partition

        int[] mergedNumbers = new int[mergedSize]; // Temporary array for merged numbers

        // Add smallest element from left or right partition to merged numbers
        while (leftPos <= j && rightPos <= k) {
            if (numbers[leftPos] <= numbers[rightPos]) {
                mergedNumbers[mergePos] = numbers[leftPos];
                leftPos++;
            } else {
                mergedNumbers[mergePos] = numbers[rightPos];
                rightPos++;
            }
            mergePos++;
        }

        // If left partition is not empty, add remaining elements to merged numbers
        while (leftPos <= j) {
            mergedNumbers[mergePos] = numbers[leftPos];
            leftPos++;
            mergePos++;
        }

        // If right partition is not empty, add remaining elements to merged numbers
        while (rightPos <= k) {
            mergedNumbers[mergePos] = numbers[rightPos];
            rightPos++;
            mergePos++;
        }

        // Copy merged numbers back into the original array
        for (mergePos = 0; mergePos < mergedSize; mergePos++) {
            numbers[i + mergePos] = mergedNumbers[mergePos];
        }
    }

    // MergeSort function that divides the array and calls merge on sorted partitions
    public static void mergeSort(int[] numbers, int i, int k) {
        if (i < k) {
            int j = (i + k) / 2;  // Find the midpoint in the partition

            // Recursively sort the left and right partitions
            mergeSort(numbers, i, j);
            mergeSort(numbers, j + 1, k);

            // Merge the sorted left and right partitions
            merge(numbers, i, j, k);
        }
    }
    }
