package com.queue;

public class QueueAsArray {

    static private int front, rear, capacity;
    static private int[] queue;

    public QueueAsArray(int c) {
        capacity = c;
        front = rear = 0;
        queue = new int[c];
    }

    boolean enqueue(int value) {

        // Check if the queue is full
        if (capacity == rear) {

            System.out.println("Queue is full");
            return false;
        }

        queue[rear] = value;
        rear++;

        return true;
    }

    boolean dequeue() {

        if (front == rear) {
            System.out.println("The queue is empty");
            return false;
        } else {

            for (int i = 0; i < rear - 1; i++) { // Remember rear transient value is index of last element + 1
                queue[i] = queue[i + 1];
            }

            // store 0 at rear indicating there's no element
            if (rear < capacity)
                queue[rear] = 0;

            // decrement rear
            rear--;
        }
        return true;

    }

    // print queue elements
    static void display() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    // print front of queue
    static void front() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d",
                queue[front]);
        return;
    }
}
