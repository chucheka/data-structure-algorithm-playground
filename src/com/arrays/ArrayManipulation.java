package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayManipulation {

    public static void main(String[] args) {

        char[] chars = {'c', 'h', 'i', 'k', 'e', 'u'};

        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));

    }

    private static int[] twoSum(int[] arr, int target) {

        Map<Integer, Integer> lookUp = new HashMap<>();

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (lookUp.containsKey(target - arr[i])) {
                index = i;
                break;
            }

            lookUp.put(arr[i], i);
        }

        return new int[]{lookUp.get(target - arr[index]),index };
    }

    private static char[] reverseArray(char[] chars) {

        char[] result = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {

            result[i] = chars[chars.length - 1 - i];

            result[chars.length - 1 - i] = chars[i];
        }

        return result;
    }
}
