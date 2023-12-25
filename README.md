# DATA STRUCTURE AND ALGORITHM PLAYGROUND

https://www.scaler.com/topics/data-structures



## Sliding Window

https://itnext.io/sliding-window-algorithm-technique-6001d5fbe8b3

https://levelup.gitconnected.com/an-introduction-to-sliding-window-algorithms-5533c4fe1cc7


## Kadane Algorithm

<p>
The Kadane algorithm is a dynamic programming technique for finding the maximum contiguous subarray sum within an array of integers. It's efficient and elegant, making it a popular solution for this common problem. Here's a breakdown for beginners in algorithms and data structures:

The Problem:

Imagine you have a list of numbers representing your daily income for a week. Some days are profitable (positive numbers), while others are not (negative numbers). You want to find the longest stretch of days where your income was consistently high, resulting in the maximum total sum.

The Solution: Kadane Algorithm:

Optimism and Accumulation:

Start with a current_sum variable set to 0, representing the sum of the current subarray you're considering.
Iterate through the array: For each element, add it to the current_sum. This simulates accumulating your daily income.

Remember the Best:

Maintain a max_sum variable, initially set to 0. This represents the largest subarray sum you've seen so far.
Compare: After adding each element, check if the current_sum is greater than max_sum. If yes, update max_sum with the current value. This ensures you remember the most profitable stretch of days.
Reset and Move On:

If the current_sum becomes negative, it means the current subarray contributes negatively to your total income. Discard it! Set current_sum back to 0 and start accumulating from the next element. This simulates starting a new "week" after a bad day.

The Answer:

After iterating through the entire array, the max_sum variable holds the answer: the maximum sum of any contiguous subarray.
Why Kadane?

Efficient: Kadane has a time complexity of O(n), meaning it runs in proportion to the array size, making it faster than brute-force approaches.
Dynamic Programming: It leverages the concept of "optimal substructures," meaning the solution for a sub-problem contributes to the solution for the larger problem.
Simple and Elegant: The algorithm is easy to understand and implement, even for beginners.
In Summary:

Think of Kadane as a smart algorithm that tracks the ups and downs of your income, remembering the best stretch of profitable days. It helps you find the most financially successful period, even if your daily earnings fluctuate.
</p>

https://medium.com/@rsinghal757/kadanes-algorithm-dynamic-programming-how-and-why-does-it-work-3fd8849ed73d
https://www.javatpoint.com/kadanes-algorithm


## Bit Manipulation

https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation

https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/tutorial/
https://cp-algorithms.com/algebra/bit-manipulation.html
https://www.educative.io/blog/bit-manipulation-algorithms
https://www.educative.io/blog/bit-manipulation-in-java

https://dev.to/ggorantala/grokking-bit-manipulation-tricks-and-complete-guide-5cdo