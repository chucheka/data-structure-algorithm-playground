package com.patterns.two_pointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoPointerManipulation {

    public static void main(String[] args) {
        /*

        https://afteracademy.com/blog/what-is-the-two-pointer-technique/

        (1) Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.

            Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.

            Example 1:

            Input: [1, 2, 3, 4, 6], target=6
            Output: [1, 3]
            Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
            Example 2:

            Input: [2, 5, 9, 11], target=11
            Output: [0, 2]
            Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
         */

        System.out.println(isStrobogrammatic("689"));

        twoSum(new int[]{2, 5, 9, 11}, 11);

    }

    private static int[] twoSum(int[] arr, int sum) {

        int startIndex = 0;
        int endIndex = arr.length - 1;

        int[] result = new int[2];

        while (startIndex < endIndex) {

            int current_sum = arr[startIndex] + arr[endIndex];

            if (current_sum == sum) {
                result[0] = startIndex;
                result[1] = endIndex;

                break;
            }

            if (current_sum > sum) {
                endIndex -= 1;
            }

            if (current_sum < sum) {
                startIndex += 1;
            }
        }

        return result;

    }

    private static boolean isStrobogrammatic(String num) {

        Map<Character, Character> lookUp = new HashMap<>();

        lookUp.put('0', '0');
        lookUp.put('1', '1');
        lookUp.put('6', '9');
        lookUp.put('8', '8');
        lookUp.put('9', '6');

        int left = 0, right = num.length() - 1;

        while (left <= right) {

            if (!lookUp.containsKey(num.charAt(left)) || lookUp.get(num.charAt(left)) != num.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
