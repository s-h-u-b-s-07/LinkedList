package com.bridgelabz.LinkedList;

public class LinkedList {

    public static void main(String[] args) {
        System.out.println("WELCOME TO LINKEDLIST PROGRAM");

        MyLinkedlist singleLinkedlist = new MyLinkedlist();
        singleLinkedlist.insertAtHead(56);
        singleLinkedlist.insertAtTail(30);
        singleLinkedlist.insertAtTail(70);
        singleLinkedlist.display(singleLinkedlist.head);


    }
}
