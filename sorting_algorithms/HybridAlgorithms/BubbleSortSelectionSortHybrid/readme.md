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

# What Algorithm Resembles This Combined Behavior?
The closest existing algorithm to this combined behavior is:

__Insertion Sort__, which builds a sorted portion of the array incrementally (like Selection Sort), but performs local shifts or swaps to insert elements in the right position (like Bubble Sort's local corrections).
However, there are subtle differences:

__Selection Sort__ explicitly searches for the smallest element on each pass, while Insertion Sort only checks up to the current index.
__Insertion Sort__ also requires fewer comparisons for partially sorted data, whereas the Bubble Sort refinement step always compares adjacent elements.

# Equivalent Sorting Properties
__Space Complexity:__ O(1), since both Bubble Sort and Selection Sort are in-place.
__Time Complexity:__ O(n²) for the worst and average cases, as both algorithms individually exhibit quadratic performance.

# Best-Case Scenario:
If Selection Sort nearly sorts the array, Bubble Sort may terminate early with O(n) passes using an optimized version that tracks swaps. This would be closer to Insertion Sort's average-case performance for partially sorted arrays.

# Summary of Combined Sorting Behavior

insert picture here

# Conclusion
The combined sorting behavior resembles __Insertion Sort__ with redundant selection passes and additional swaps. If __Bubble Sort__ runs first, it may perform multiple unnecessary passes before __Selection Sort__ completes. Conversely, __Selection Sort__ before __Bubble Sort__ gives an initial order, which __Bubble Sort__ refines similarly to how __Insertion Sort__ handles local shifts.


# Explanation

__Step 1: Selection Sort__
Finds the minimum element in the unsorted part and places it at the current position. This pass gives an initial partial ordering.


__Step 2: Bubble Sort__
Refines the order by swapping adjacent elements if needed. It terminates early if the list is already sorted.
