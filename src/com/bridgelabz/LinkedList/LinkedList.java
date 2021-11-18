package com.bridgelabz.LinkedList;

public class LinkedList {

    public static void main(String[] args) {
        System.out.println("WELCOME TO LINKEDLIST PROGRAM");

        MyLinkedlist singleLinkedlist = new MyLinkedlist();
        singleLinkedlist.insertAtHead(70);
        singleLinkedlist.insertAtHead(30);
        singleLinkedlist.insertAtHead(56);
        singleLinkedlist.display(singleLinkedlist.head);

    }
}
