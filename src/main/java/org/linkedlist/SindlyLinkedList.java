package org.linkedlist;

public class SindlyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        SindlyLinkedList sll = new SindlyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(9);
        ListNode fourth = new ListNode(7);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        printSll(sll);
        ;

        ListNode newNode = new ListNode(77);
        insertNodeAtBeggning(sll, newNode);
        printSll(sll);

    }

    public static void printSll(SindlyLinkedList sll) {
        int lengthOfSll = 0;
        ListNode current = sll.head;
        while (current != null) {
            lengthOfSll++;
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("\nlengthOfSll : " + lengthOfSll);
    }

    public static void insertNodeAtBeggning(SindlyLinkedList sll, ListNode newNode) {
        newNode.next=sll.head;
        sll.head=newNode;
    }
}
