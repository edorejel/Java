# Bubble Sort Selection Sort Hybrid Algorithm


# What Happens When You Combine Bubble Sort and Selection Sort?
If both algorithms are run in sequence on the same data set:

Selection Sort would first pass through the data, repeatedly finding the smallest element and swapping it with the current position.
Bubble Sort would then repeatedly pass through the (partially or fully sorted) array, swapping adjacent elements if they are out of order.

# Sorting Behavior of Bubble Sort + Selection Sort
When combined:

Selection Sort establishes an initial ordering by direct minimum/maximum selection, potentially positioning many elements in or near their correct final positions.
Bubble Sort then refines the remaining ordering by performing adjacent swaps.
In essence, Selection Sort lays a partial foundation of sorted data while Bubble Sort acts like a refinement step to correct local inversions.


# Explanation

__Step 1: Selection Sort__
Finds the minimum element in the unsorted part and places it at the current position. This pass gives an initial partial ordering.


__Step 2: Bubble Sort__
Refines the order by swapping adjacent elements if needed. It terminates early if the list is already sorted.
