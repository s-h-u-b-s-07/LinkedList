package com.bridgelabz.LinkedList;

class Node<T> {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedlist {

    Node head = null;
    Node tail;

    public void add(int data) {
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

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void insertAtTail(int data) {
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

    public void insertAtMid(int position, int data) {
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
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public boolean searchKey(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void size() {
        if (isEmpty()) {
            System.out.println("Empty Linkedlist");
            return;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Length Of Linkedlist: " + count);
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

    public void sort() {
        Node current = head;
        Node nxt;

        while (current != null) {
            nxt = current.next;

            while (nxt != null) {

                if (current.data >= nxt.data) {

                    int temp = current.data;
                    current.data = nxt.data;
                    nxt.data = temp;

                }
                nxt = nxt.next;
            }
            current = current.next;
        }

    }
}
