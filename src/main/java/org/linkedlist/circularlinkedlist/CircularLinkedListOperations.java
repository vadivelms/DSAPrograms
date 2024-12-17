package org.linkedlist.circularlinkedlist;

import java.util.NoSuchElementException;

public class CircularLinkedListOperations {
    CirculatLinkedList cll = new CirculatLinkedList();

    public void createCircularLinkedList() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(4);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(10);
        ListNode five = new ListNode(7);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = one;
        cll.last = five;

    }

    public void printCircularLinkedList() {
        if (cll.last != null) {
            if (cll.last.next == null) {
                System.out.println(cll.last.data);
            } else {
                ListNode first = cll.last.next;
                while (first != cll.last) {
                    System.out.print(first.data + "-->");
                    first = first.next;
                }
                System.out.println(cll.last.data);
            }
        }
    }

    public void insertFirstCircularLinkedList(int data) {
        ListNode newNode = new ListNode(data);

        if (cll.last == null) {
            cll.last = newNode;

        } else {
            newNode.next = cll.last.next;
        }
        cll.last.next = newNode;

    }

    public void insertLastCircularLinkedList(int data) {
        ListNode newNode = new ListNode(data);
        if (cll.last == null) {
            cll.last = newNode;
            cll.last.next = cll.last;
        } else {
            newNode.next = cll.last.next;
            cll.last.next = newNode;
            cll.last = newNode;
        }
    }

    public ListNode deleteFirstCircularLinkedList() {

            if (cll.last == null) {
                throw new NoSuchElementException();
            }
            ListNode temp = cll.last.next;
            if (cll.last.next == cll.last) {
                cll.last = null;
            }else{
                cll.last.next=temp.next;
                temp.next=null;
            }
        return temp;

    }
}
