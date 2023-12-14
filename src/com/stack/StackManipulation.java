package com.stack;

public class StackManipulation {
    /*
    Implementation of Stack:
    There are two ways to implement a stack

    (1) Using array
    (2) Using linked list
     */
    public static void main(String[] args) {

        StackArray stackArray = new StackArray();

        stackArray.push(0);
        stackArray.push(1);
        stackArray.push(2);

        System.out.println("The top element is "+ stackArray.peek());
        System.out.println("The element removed is  "+ stackArray.pop());
        System.out.println("The current height of the stack "+ stackArray.size());


        stackArray.print();

    }
}
