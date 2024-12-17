package org.linkedlist.doublylinkedlist;

public class DoublyLinkedList {
    public ListNode head;
    public ListNode tail;
    public int length;
    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }
    public int length(){
        return length;
    }
}
