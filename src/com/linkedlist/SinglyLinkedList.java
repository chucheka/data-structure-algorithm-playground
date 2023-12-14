package com.linkedlist;


public class SinglyLinkedList {

    /*
     * Search O(n)
     * Insertion O(1)
     * Deletion O(1)
     */
    Node head;
    Node tail;
    int length;

    public SinglyLinkedList(int data) {
        Node new_node = new Node(data);
        head = new_node;
        tail = new_node;
        length = 1;
    }

    class Node {
        int data;
        Node next;
//        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void deleteFront() {

        if (head == null)
            System.out.println("List can't be empty");

        head = head.next;
    }

    public void delete(int key) {

        Node temp = head;
        Node prev_node = null;

        if (temp == null) {
            return;
        }

        if (temp != null && temp.data == key) {
            head = head.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev_node = temp;
            temp = temp.next;
        }

        prev_node.next = temp.next;
    }

    public void append(int data) {

        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }

        length++;

    }

    public void insertFront(int data) {

        Node new_node = new Node(data);

        if (head != null) {
            new_node.next = head;
        }

        head = new_node;

    }

    public void insertAfter(Node prev_node, int data) {

        if (prev_node == null) {
            System.out.println("The previous node can't be Null");
        }

        Node new_node = new Node(data);

        new_node.next = prev_node.next;

        prev_node.next = new_node;
    }


    /* This function prints contents of linked list starting
     * from head */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
