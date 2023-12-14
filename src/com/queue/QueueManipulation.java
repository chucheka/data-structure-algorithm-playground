package com.queue;

public class QueueManipulation {

    public static void main(String[] args) {

        QueueAsArray queue = new QueueAsArray(5);

//        queue.enqueue(1);
//        queue.enqueue(3);
//        queue.enqueue(8);
//        queue.enqueue(9);
//        queue.enqueue(12);
        queue.enqueue(16);

        queue.dequeue();
        QueueAsArray.display();

    }
}
