package com.algorithms.sorting;

import java.util.Arrays;

public class SortingAlgorithm {

    public static void main(String[] args) {
//        bubbleSort(new int[]{5, 1, 6, 2, 4, 3});
//        selectionSort(new int[]{5, 1, 6, 2, 4, 3});
//        insertionSort(new int[]{2, 4, 1, 3, 5, 6});


        System.out.println("THE MERGED ARRAY IS " + Arrays.toString(mergeSort(new int[]{2, 4, 1, 3, 5, 6})));
    }

    private static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("THE SORTED ARRAY IS " + Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        /*
        The idea is to find the index of the lowest value for each iteration through the array.
        When the index is found, the element at the index position is swapped with the current iterating element
         */


        for (int i = 0; i < array.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

        }
        System.out.println("THE SORTED ARRAY IS " + Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {


        for (int i = 1; i < array.length; i++) {

            int j = i - 1;

            int temp = array[i];

            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }

        }
        System.out.println("THE SORTED ARRAY IS " + Arrays.toString(array));
    }

    private static int[] mergeSort(int[] array) {

        if (array.length==1) return array;

        int midIndex = array.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left,right);

    }

    private static int[] merge(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int index = 0;

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                result[index] = arr1[i];
                index++;
                i++;
            } else {
                result[index] = arr2[j];
                index++;
                j++;
            }
        }

        while (i < arr1.length) {
            result[index] = arr1[i];
            index++;
            i++;
        }

        while (j < arr2.length) {
            result[index] = arr2[j];
            index++;
            j++;
        }

        return result;
    }
}
