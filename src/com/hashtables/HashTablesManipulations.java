package com.hashtables;

public class HashTablesManipulations {
    public static void main(String[] args) {

        HashTable myHashTable = new HashTable(7);

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printHashTable();
    }
}
