package com.stack;

// Java Code for Linked List Implementation

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class StackAsLinkedList {

    /*
    Advantages of Linked List implementation:
    (1) The linked list implementation of a stack can grow and shrink according to the needs at runtime.
    (2) It is used in many virtual machines like JVM.
    Disadvantages of Linked List implementation:
    (1) Requires extra memory due to the involvement of pointers.
    (2) Random accessing is not possible in stack.
     */
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) { this.data = data; }
    }

    public boolean isEmpty()
    {
        if (root == null) {
            return true;
        }
        else
            return false;
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);

        if (root == null) {
            root = newNode;
        }
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop()
    {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public int peek()
    {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop()
                + " popped from stack");
        Queue queue = new ArrayDeque();

        queue.peek();

        System.out.println("Top element is " + sll.peek());
    }
}
