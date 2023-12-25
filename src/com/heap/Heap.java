package com.heap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*

    Heap Data Structure is a special case of balanced binary tree data structure where the root-node key is compared with
    its children and arranged accordingly. Min-Heap − Where the value of the root node is less than or equal to either
    of its children. Max-Heap − Where the value of the root node is greater than or equal to either of its children.

    Takeaways
    Complexity of Heap Data Structure
    Get Max or Min Element - O(1)
    Remove Max or Min Element - O(Log n)
    Insert an Element - O(Log n)
    heap data structure are a special kind of tree data structure that follow the under-given conditions:

    * The given tree should be a complete binary tree.
    * It should satisfy the heap property. It means that all the children of a given node must be greater
      than the parent node, or all the children must be smaller than the parent node

    Note: Heaps are filled from left to right
 */

public class Heap {

    private List<Integer> values;

    public Heap() {
        this.values = new ArrayList<>();
    }


    /*
        To heapify an array or an already existing heap,find the position of the last non-leaf node
        and perform the heapify operation of each non-leaf node in reverse level order.

        e.g
        Input: arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17} ,

        given the above array, the index of the last non-leaf node is given below

       i =  ((n-1)-1)/2 where n = size of the array

       Note that the parent of a node at i index is given as (i-1)/2. So in the above case

       the last node is given by n-1, therefore the parent of the last node will be given by

       ((n-1)-1)/2

       So we start heapifying from ((n-1)-1)/2

       So from the above we are heapifying recursively from 6, then 4,then 5,then 3 etc ie  [1, 3, 5, 4, 6]


     */
    public void heapify(int i) {

        int size = values.size();

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && values.get(left) > values.get(largest)) {
            largest = left;
        }

        if (right < size && values.get(right) > values.get(largest)) {
            largest = right;
        }

        // If largest is not the root, swap and recursively heapify
        if (largest != i) {
//            Collections.swap(values, i, largest);
            swap(i, largest);
            heapify(largest);
        }
    }

    public void insert(int value) {
        values.add(value);

        int i = values.size() - 1;

        while (i > 0 && values.get(i) > values.get(parent(i))) {

            values.set(i, values.get(parent(i)));
            values.set(parent(i), value);

            i = parent(i);

        }

    }

    public boolean delete(int value) {

        int i = values.indexOf(value);

        if (i == -1) {
            return false;
        }

        int lastIndex = values.size() - 1;

        if (lastIndex == values.size() - 1) {
            values.remove(lastIndex);

            return true;
        }

        int temp = values.get(lastIndex);

        values.set(lastIndex, value);
        values.set(i, temp);

        values.remove(lastIndex);

        // Heapify the heap again

        heapify(i);

        return true;
    }

    // Return a new object reference of the heap so that the vales are not changed unintentionally which could
    // alter the validity of the heap
    public List<Integer> getHeap() {
        return new ArrayList<>(values);
    }

    public int leftChild(int index) {
        return 2 * index + 1;
    }

    public int rightChild(int index) {
        return 2 * index + 2;
    }

    public int parent(int index) {
        return (index - 1) / 2;
    }

    public void swap(int index1, int index2) {
        int temp = values.get(index1);
        values.set(index1, values.get(index2));
        values.set(index2, temp);
    }
}
