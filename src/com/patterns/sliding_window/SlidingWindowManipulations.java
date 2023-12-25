package com.patterns.sliding_window;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
    Sliding window problems can be either of fixed-sized or variable length algorithm problems

    //PROBLEMS ON SLIDING WINDOW
    https://itnext.io/sliding-window-algorithm-technique-6001d5fbe8b3

    // READING LINKS


 */

public class SlidingWindowManipulations {

    /*
        * (1) Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
        * e.g Input: Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
        * Output: Averages of subarrays of size K: [2.2, 2.8, 2.4, 3.6, 2.8]
        *
        * (2) Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

            Example 1:

            Input: [2, 1, 5, 1, 3, 2], k=3
            Output: 9
            Explanation: Subarray with maximum sum is [5, 1, 3]

            *
        * (3)  Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.

            Example 1:

            Input: [2, 1, 5, 2, 3, 2], S=7
            Output: 2
            Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2].
            Example 2:

            Input: [2, 1, 5, 2, 8], S=7
            Output: 1
            Explanation: The smallest subarray with a sum greater than or equal to '7' is [8].
            Example 3:

            Input: [3, 4, 1, 1, 6], S=8
            Output: 3
            Explanation: Smallest subarrays with a sum greater than or equal to '8' are [3, 4, 1] or [1, 1, 6].

         * (4) Given an array of 0’s and 1’s, find the maximum sequence of continuous 1’s that can be formed by flipping at-most k 0’s to 1’s.
         * (5) Given a string and n characters, find the shortest substring that contains all the desired characters.
         *
         * (6) Given a binary array nums, return the maximum number of consecutive 1's in the array
             EXAMPLE 1
                Input: nums = [1,1,0,1,1,1]
                Output: 3
                Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
              EXAMPLE 2
                Input: nums = [1,0,1,1,0,1]
                Output: 2
         * (7) Given a string s, find the length of the longest substring without repeating characters.
         */
    public static void main(String[] args) {

        //   System.out.println(lengthOfTheLongestSubstringWithoutRepeatingCharacters("pwwkwew"));
//        System.out.println("THE MAX SUM IS " + maximumSubArrayOfKLength(new int[]{2, 1, 5, 1, 3, 2}, 3));
        System.out.println("THE MAX SUM IS " + maximumSubArrayOfKLength(new int[]{-2, 1, -5, 1, 3, -2}, 2));

    }


    private static int maximumSubArrayOfKLength(int[] arr, int k) {

        int max_sum = 0;
        int curr_sum = 0;


        for (int i = 0; i < k; i++) {
            curr_sum += arr[i];
        }

        max_sum = curr_sum;

        for (int endIndex = k; endIndex < arr.length; endIndex++) {

            curr_sum += arr[endIndex] - arr[endIndex - k];

            max_sum = Math.max(curr_sum, max_sum);

        }

        return max_sum;

    }

    private static int lengthOfTheLongestSubstringWithoutRepeatingCharacters(String s) {

        Map<Character, Integer> lookUp = new HashMap<>();

        int maxLength = 0;

        for (int left = 0, right = 0; right < s.length(); right++) {


            if (lookUp.containsKey(s.charAt(right))) {
                left = Math.max(lookUp.get(s.charAt(right)), left);
            }

            maxLength = Math.max(right - left + 1, maxLength);

            lookUp.put(s.charAt(right), right + 1);
        }

        return maxLength;
    }
}
