package com.javacollections;

import java.util.*;

public class JavaCollectionFramework {
    public static void main(String[] args) {

        Queue<String> names = new ArrayDeque<>();

        names.add("Chike");
        names.add("Ucheka");

        System.out.println("THE QUEUE FIRST VALUE " + names);


        Deque<Integer> stack = new ArrayDeque<>();


        stack.offer(1);
        stack.offer(7);
        stack.offerFirst(2);
        stack.offerLast(4);

        System.out.println("THE COLLECTIONS " + Collections.frequency(stack, 2));

        List<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(9);


        System.out.println("PRINT STACK ELEMENTS " + stack.poll());
        System.out.println("CHECK IF TWO COLLECTIONS HAVE THE SAME ELEMENT "+Collections.disjoint(stack,nums));
    }

}
