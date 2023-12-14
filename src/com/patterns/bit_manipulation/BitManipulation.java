package com.patterns.bit_manipulation;

public class BitManipulation {
    /*
    AND &
    OR |
    XOR ^
    NOT ~
    Left Shift <<
    Arithmetic(Signed) Right Shift >>
    Logical(Unsigned) Right shift  >>>
    In Java, all integer data types are signed and << and >> are solely arithmetic shifts.

    Bit Tricks
    (1) Check if a number is even, x & 1 == 0
    (2) Toggle a character from uppercase to lower case and vice versa, ch^ = 32
    (3) Multiply a number n by 2 raised to a number b = 2 raised to power b e.g 6 << 3 = 6 * 2 raised to 3
    (4) a ^ a = 0, a ^ 0= a, a ^ b ^ a = (a ^ a) ^ b

    (1) Find the element in an array that is not repeated.

        Input: nums = { 4, 1, 2, 9, 1, 4, 2 }

        Output: 9
     */
    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 9, 1, 4, 2};
        System.out.println("Element appearing one time is " + findNonRepeatedNumberInAnArray(nums));
    }

    private static int findNonRepeatedNumberInAnArray(int[] nums){

        int num = 0;

        for (int i = 0; i <nums.length ; i++) {

            num ^= nums[i];
        }

        return num;
    }
}
