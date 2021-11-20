package com.bridgelabz.LinkedList;

class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedlist<T> {


    Node head = null;
    Node tail;

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }


    public void insertAtHead(T data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void insertAtTail(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            insertAtHead(data);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }

    public void insertAtMid(int position, T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            System.out.println("Empty Linkedlist");
            return;
        }

        Node temp = head;
        int idx = 1;
        while (temp.next != null) {
            if (idx == position - 1) {
                break;
            }
            idx++;
            temp = temp.next;
        }
        Node nxt = temp.next;
        temp.next = newNode;
        newNode.next = nxt;
    }

    public Node pop() {
        if (isEmpty()) {
            System.out.println("Empty Linkedlist");
            return head;
        }
        Node newHead = head.next;
        return newHead;
    }

    public void popLast() {
        if (isEmpty()) {
            System.out.println("Empty Linkedlist");
            return ;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }


    public void display(Node head) {
        if (isEmpty()) {
            System.out.println("Empty Linkedlist");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }


}

