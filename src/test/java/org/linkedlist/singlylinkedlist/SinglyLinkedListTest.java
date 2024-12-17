package org.linkedlist.singlylinkedlist;

import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {
    public static void main(String[] args) {

        SindlyLinkedList sll = new SindlyLinkedList();
        SindlyLinkedListOperations sllOps = new SindlyLinkedListOperations();
//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(2);
//        ListNode third = new ListNode(9);
//        ListNode fourth = new ListNode(7);
//        sll.head.next = second;
//        second.next = third;
//        third.next = fourth;

//        printSll(sll);
//        insertNodeAtBeggning(sll, new ListNode(77));
//        printSll(sll);
//        insertNodeAtBeggning(sll, new ListNode(1));
//        printSll(sll);
//        insertNodeAtBeggning(sll, new ListNode(4));
//        printSll(sll);
//
//        insertNodeAtEnd(sll, new ListNode(87));
//        printSll(sll);
//
//        insertNodeAtGivenPosition(sll, new ListNode(22), 5);
//        printSll(sll);
//        deleteFirst(sll);
//        printSll(sll);
//
//        System.out.println(deleteLast(sll).data);
//        printSll(sll);
//        deleteAtPosition(sll, 1);
//        printSll(sll);
//        System.out.println(find(sll.head, 87));
//        System.out.println(find(sll.head, 22));
//        printSll(sll);
//        sll.head = reverse(sll.head);
//        printSll(sll);
//        System.out.println(find(sll.head, 22));
//        sll.head = deleteNode(sll.head, 22);
//        printSll(sll);

//        sll.head = sllOps.createALoopInList();
//
//        System.out.println(sllOps.containsLoop(sll.head));
//        System.out.println(sllOps.startNodeOfLoop(sll.head).data);
//
//        sllOps.removeLoopFromList(sll.head);
//        sllOps.printSll(sll);


    }

    @Test
    void testMerge() {
        SindlyLinkedListOperations sindlyLinkedListOperations = new SindlyLinkedListOperations();

        ListNode one = new ListNode(1);
        ListNode four = new ListNode(4);
        ListNode eight = new ListNode(8);
        one.next = four;
        four.next = eight;

        ListNode three = new ListNode(3);
        ListNode six = new ListNode(6);
        three.next = six;

        sindlyLinkedListOperations.printSll(one);
        sindlyLinkedListOperations.printSll(three);

        ListNode newHead = sindlyLinkedListOperations.mergeTwoSortedList(one, three);
        sindlyLinkedListOperations.printSll(newHead);

    }

    @Test
    void testAdd() {
        SindlyLinkedList sl1 = new SindlyLinkedList();
        SindlyLinkedList sl2 = new SindlyLinkedList();
        SindlyLinkedListOperations ops = new SindlyLinkedListOperations();
        sl1.head = new ListNode(7);
        sl2.head = new ListNode(5);

        ops.insertNodeAtEnd(sl1, new ListNode(4));
        ops.insertNodeAtEnd(sl1, new ListNode(9));

        ops.insertNodeAtEnd(sl2, new ListNode(6));

        ListNode newHead = ops.add(sl1.head, sl2.head);

        ops.printSll(sl1);
        ops.printSll(sl2);
        ops.printSll(newHead);

    }

    @Test
    void testMergeBetween() {
        SindlyLinkedList sl1 = new SindlyLinkedList();
        SindlyLinkedList sl2 = new SindlyLinkedList();
        SindlyLinkedListOperations ops = new SindlyLinkedListOperations();
        sl1.head = new ListNode(10);
        sl2.head = new ListNode(1000000);

        ops.insertNodeAtEnd(sl1, new ListNode(1));
        ops.insertNodeAtEnd(sl1, new ListNode(13));
        ops.insertNodeAtEnd(sl1, new ListNode(6));
        ops.insertNodeAtEnd(sl1, new ListNode(9));
        ops.insertNodeAtEnd(sl1, new ListNode(5));

        ops.insertNodeAtEnd(sl2, new ListNode(100001));
        ops.insertNodeAtEnd(sl2, new ListNode(1000002));

        ListNode newHead = ops.mergeInBetween(sl1.head, 3, 4, sl2.head);

        ops.printSll(sl1);
        ops.printSll(sl2);
        ops.printSll(newHead);
    } @Test
    void testPalintrom() {
        SindlyLinkedList sl1 = new SindlyLinkedList();

        SindlyLinkedListOperations ops = new SindlyLinkedListOperations();
        sl1.head = new ListNode(10);


        ops.insertNodeAtEnd(sl1, new ListNode(1));
        ops.insertNodeAtEnd(sl1, new ListNode(13));
        ops.insertNodeAtEnd(sl1, new ListNode(12));
        ops.insertNodeAtEnd(sl1, new ListNode(1));
        ops.insertNodeAtEnd(sl1, new ListNode(10));
        SindlyLinkedListOperations.printSll(sl1);
        System.out.println(SindlyLinkedListOperations.isPalintrom(sl1.head));
    }
}
