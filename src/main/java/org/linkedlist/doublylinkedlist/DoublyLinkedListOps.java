package org.linkedlist.doublylinkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedListOps {
    DoublyLinkedList dll = new DoublyLinkedList();

    public void insetLast(int data) {

        ListNode newNode = new ListNode(data);

        if (dll.head == null) {
            dll.head = newNode;
        } else {
            dll.tail.next = newNode;
        }
        newNode.previous = dll.tail;
        dll.tail = newNode;
        dll.length++;
    }

    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (dll.isEmpty()) {
            dll.tail = newNode;
        } else {
            dll.head.previous = newNode;
        }
        newNode.next = dll.head;
        dll.head = newNode;
        dll.length++;
    }

    public void displayForword() {
        if (dll.head == null)
            return;
        ListNode temp = dll.head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackword() {
        if (dll.head == null)
            return;
        ListNode temp = dll.tail;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public ListNode deleteFirst() {
        ListNode temp = dll.head;

        if (dll.isEmpty()) {
            throw new NoSuchElementException();
        }
        if (dll.head == dll.tail) {
            dll.tail = null;
        } else {
            dll.head.next.previous = null;
        }
        dll.head = dll.head.next;
        temp.next = null;
        return temp;
    }
    public ListNode deleteLast() {
        ListNode temp = dll.tail;

        if (dll.isEmpty()) {
            throw new NoSuchElementException();
        }
        if (dll.head == dll.tail) {
            dll.head = null;
        } else {
            dll.tail.previous.next = null;
        }
        dll.tail = dll.tail.previous;
        temp.previous = null;
        return temp;
    }
}
