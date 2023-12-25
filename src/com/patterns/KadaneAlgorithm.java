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

    /*

     Given an array of integers, find the subarray with the maximum possible sum with at least k elements

 */

    static long maxSumWithK(int[] arr, int k)
    {

        // calculating sum of the first k elements
        // of the array
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        long last = 0;
        int j = 0;
        long ans = Long.MIN_VALUE;
        ans = Math.max(ans, sum);

        // iterating over the subarrays
        // and updating the sum accordingly
        for (int i = k; i < arr.length; i += 1) {
            sum = sum + arr[i];
            last = last + arr[j++];

            // using sliding window
            // to update the ans
            ans = Math.max(ans, sum);
            if (last < 0) {
                sum = sum - last;
                ans = Math.max(ans, sum);
                last = 0;
            }
        }
        return ans;
    }
    private static int maximum_subarray_sum_with_atleast_k_elements(int[] arr, int k) {



        int curr_sum = 0;

        for (int i = 0; i < k; i++) {
            curr_sum += arr[i];
        }

        int max_sum = curr_sum;

        for (int i = k; i < arr.length; i++) {

            curr_sum = curr_sum + arr[i];

            if (max_sum < curr_sum) max_sum = curr_sum;

            if (curr_sum < 0) curr_sum = 0;
        }

        return max_sum;

    }

    public static int maximum_subarray_sum_with_atleast_k_elements_v2(int[] arr, int k) {

        int[] maxSum = new int[arr.length];

        maxSum[0] = arr[0];

        for (int i = 1 ; i < arr.length; i++) {
            maxSum[i] = Math.max(arr[i], maxSum[i - 1] + arr[i]);
        }

        int sum = 0 ;
        for (int i = 0 ; i < k; i++) {
            sum += arr[i];
        }

        int ans = sum;
        for (int i = k ; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            ans = Math.max(ans, sum);
            ans = Math.max(ans, sum + maxSum[i - k]);
        }

        return ans;
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


