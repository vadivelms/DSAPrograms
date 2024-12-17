package org.linkedlist.doublylinkedlist;

import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {

    @Test
    void testDisplay() {
        DoublyLinkedListOps dops = new DoublyLinkedListOps();
        dops.insetLast(2);
        dops.insetLast(4);
        dops.insetLast(5);
        dops.insetLast(7);
        dops.insetLast(2);
        dops.insetLast(7);
        dops.insetLast(9);
        dops.displayForword();
        dops.displayBackword();
    }
    @Test
    void testInsertFirst() {
        DoublyLinkedListOps dops = new DoublyLinkedListOps();
        dops.insertFirst(2);
        dops.insertFirst(4);
        dops.insertFirst(5);
        dops.insertFirst(7);
        dops.insertFirst(2);
        dops.insertFirst(7);
        dops.insertFirst(9);
        dops.displayForword();
        dops.displayBackword();
    }
    @Test
    void testDeleteFirst() {
        DoublyLinkedListOps dops = new DoublyLinkedListOps();
        dops.insertFirst(2);
        dops.insertFirst(4);
        dops.insertFirst(5);

        dops.displayForword();

        System.out.println(dops.deleteFirst().data);
        System.out.println(dops.deleteFirst().data);
        System.out.println(dops.deleteFirst().data);

        dops.displayForword();
    }
    @Test
    void testDeleteLast() {
        DoublyLinkedListOps dops = new DoublyLinkedListOps();
        dops.insertFirst(2);
        dops.insertFirst(4);
        dops.insertFirst(5);

        dops.displayForword();

        System.out.println(dops.deleteLast().data);
        System.out.println(dops.deleteLast().data);
        System.out.println(dops.deleteLast().data);

        dops.displayForword();
    }
}
