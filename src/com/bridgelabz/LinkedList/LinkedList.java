package com.bridgelabz.LinkedList;

public class LinkedList {

    public static void main(String[] args) {
        System.out.println("WELCOME TO LINKEDLIST PROGRAM");

        MyLinkedlist singleLinkedlist = new MyLinkedlist();
        singleLinkedlist.add(56);
        singleLinkedlist.add(30);
        singleLinkedlist.add(70);
        singleLinkedlist.popLast();
        singleLinkedlist.display(singleLinkedlist.head);


    }
}
