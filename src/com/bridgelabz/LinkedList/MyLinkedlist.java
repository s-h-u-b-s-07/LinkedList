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

    /**
     * UC1 Create a simple linkedlist of 56,30 and 70.
     *
     * @author prem
     * @version 12.1
     * @since 25/08/2021
     */

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

    /**
     * UC2 Ability to create linkedlist by adding 30 and 56 to 70.
     *
     * @author prem
     * @version 12.2
     * @since 25/08/2021
     */

    public void insertAtHead(T data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    /**
     * UC3 Ability to create linkedlist by appending 30 and 70 to 56.
     *
     * @author prem
     * @version 12.3
     * @since 25/08/2021
     */

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

    /**
     * UC4 Ability to insert 30 between 56 and 70.
     *
     * @author prem
     * @version 12.4
     * @since 25/08/2021
     */

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

    /**
     * UC5 Ability to delete first element in the linkedlist .
     *
     * @author prem
     * @version 12.5
     * @since 25/08/2021
     */

    public Node pop() {
        if (isEmpty()) {
            System.out.println("Empty Linkedlist");
            return head;
        }
        Node newHead = head.next;
        return newHead;
    }

    /**
     * UC6 Ability to delete last element in the linkedlist .
     *
     * @author prem
     * @version 12.6
     * @since 25/08/2021
     */

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

    /**
     * UC7 Ability to serch linkedlist to find node with value 30.
     *
     * @author prem
     * @version 12.7
     * @since 25/08/2021
     */

    public boolean searchKey(T key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
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
