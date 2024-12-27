# Pigeonhole Sort 

The Pigeonhole Principle states that if 𝑛 items are put into 𝑚 containers, where 𝑛 > 𝑚, then at least one container must contain more than one item. 

In sorting, this principle is used to "place items into specific holes" (or bins) based on their values, and each bin may have more than one item.

Steps for a Pigeonhole Sort:
1. Find the Range of Values:
- Determine the minimum and maximum values in the array.
- Create a set of "pigeonholes" (bins) for all possible values in the range.

2. Place Items in Their Holes:
- Each element is placed into its corresponding bin (directly mapped based on value).

3. Reconstruct the Sorted List:
- Iterate through the bins in order and gather the elements.

Efficiency:
- Time Complexity:
- - Placement in bins: 𝑂(𝑛)(one pass through the array).
- - Reconstruction from bins: 𝑂(𝑛 + 𝑘) where 𝑘 is the range of the values.
- - Overall: 𝑂(𝑛 + 𝑘).

Space Complexity: 𝑂(𝑘), where 𝑘 is the range of values (for the bins).

# Comparison with Bubble Sort
1. Time Complexity:
- Bubble Sort: 𝑂(𝑛^2) in the worst and average cases. It compares and swaps elements repeatedly, which is inefficient for large datasets.
- Pigeonhole Sort: 𝑂(𝑛 + 𝑘) When 𝑘 (the range of values) is small relative to 𝑛, Pigeonhole Sort is much faster.

2. Space Complexity:
- Bubble Sort: 𝑂(1). It is an in-place sorting algorithm requiring no extra memory.
- Pigeonhole Sort: 𝑂(𝑘). It requires additional space proportional to the range of values.

3. Suitability:
- Bubble Sort: Works for any input but is inefficient for large or complex datasets.
- Pigeonhole Sort: Extremely efficient for small ranges of integer values but impractical for large ranges or non-integer data.

  # Example
![example image](https://github.com/edorejel/Java/blob/main/sorting_algorithms/PigeonholeSort/images/Screenshot%202024-12-26%20203802.png)

  # Conclusion
  
![conclusion image](https://github.com/edorejel/Java/blob/main/sorting_algorithms/PigeonholeSort/images/Screenshot%202024-12-26%20203911.png)

  # Feature of Pigeonhole - "Arrays within Arrays"

  ![feature of pigeonhole](https://github.com/edorejel/Java/blob/main/sorting_algorithms/PigeonholeSort/images/Screenshot%202024-12-26%20203945.png)

  # Key Feauture of "Arrays within Arrays"

  ![feature of arrays within arrays](https://github.com/edorejel/Java/blob/main/sorting_algorithms/PigeonholeSort/images/Screenshot%202024-12-26%20204102.png)
