package com.patterns;

import java.util.Arrays;

public class KadaneAlgorithm {

    public static void main(String[] args) {
        System.out.println("THE MAXIMUM SUBARRAY SUM " + maximum_subarray_sum_2(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));

        System.out.println("THE MAXIMUM SUBARRAY  " + Arrays.toString(maximum_subarray(new int[]{-2, -3, 4, -1, -2, 1, 5, -3})));
    }

    private static int maximum_subarray_sum(int[] arr) {

        int max_sum = Integer.MIN_VALUE;

        int curr_sum = 0;

        for (int i = 0; i < arr.length; i++) {

            curr_sum = curr_sum + arr[i];

            if (max_sum < curr_sum) max_sum = curr_sum;

            if (curr_sum < 0) curr_sum = 0;
        }

        return max_sum;
    }

    private static int maximum_subarray_sum_2(int[] arr) {

        int global_max = Integer.MIN_VALUE;

        int local_max = 0;

        for (int i = 0; i < arr.length; i++) {

            local_max = Math.max(arr[i], local_max + arr[i]);

            if (global_max < local_max) global_max = local_max;
        }

        return global_max;
    }



    static int[] maximum_subarray(int[] arr) {

        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        int start = 0;
        int end = 0;
        int s = 0;

        for (int i = 0; i < arr.length; i++) {

            curr_sum += arr[i];

            if (max_sum < curr_sum) {
                max_sum = curr_sum;
                start = s;
                end = i;
            }

            if (curr_sum < 0) {
                curr_sum = 0;
                s = i + 1;
            }
        }

        // Arrays.copyRange(int[] arr, int fromIndex, int count)
        return Arrays.copyOfRange(arr, start, end + 1);

    }
}


