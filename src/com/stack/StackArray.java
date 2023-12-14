package com.stack;

public class StackArray {
    /*
    Advantages of array implementation:
    (1) Easy to implement.
    (2) Memory is saved as pointers are not involved.
    Disadvantages of array implementation:
    (1) It is not dynamic i.e., it doesn’t grow and shrink depending on needs at runtime. [But in case of dynamic sized arrays like vector in C++, list in Python, ArrayList in Java, stacks can grow and shrink with array implementation as well].
    (2) The total size of the stack must be defined beforehand.
     */
    static final int max = 1000;
    private int top;
    private int[] a = new int[max];

    StackArray() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int value) {
        if (top >= (max - 1)) {
            System.out.println("Stack overflow");
            return false;
        }

        a[++top] = value;
        System.out.println(value + " pushed to stack");
        return true;
    }

    int pop() {

        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }

        return a[top--];
    }

    int peek() {

        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }

        return a[top];
    }

    int size() {
        return top + 1;
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}
