package org.linkedlist.CirculatLinkedList;

import org.junit.jupiter.api.Test;
import org.linkedlist.circularlinkedlist.CircularLinkedListOperations;

public class CircularLinkedListTest {
    CircularLinkedListOperations cllOps = new CircularLinkedListOperations();

    @Test
    void testPrintCirculatLinkedList() {

        cllOps.createCircularLinkedList();
        cllOps.printCircularLinkedList();
    }

    @Test
    void testInsertFirstCircularLinkedList() {
        cllOps.insertFirstCircularLinkedList(2);
        cllOps.insertFirstCircularLinkedList(5);
        cllOps.insertFirstCircularLinkedList(7);
        cllOps.insertFirstCircularLinkedList(2);
        cllOps.insertFirstCircularLinkedList(3);

        cllOps.printCircularLinkedList();
    }

    @Test
    void testInsertLastCircularLinkedList() {
        cllOps.insertLastCircularLinkedList(2);
        cllOps.insertLastCircularLinkedList(5);
        cllOps.insertLastCircularLinkedList(7);
        cllOps.insertLastCircularLinkedList(2);
        cllOps.insertLastCircularLinkedList(3);

        cllOps.printCircularLinkedList();
    }

    @Test
    void testDeleteFirstCircularLinkedList (){
        cllOps.insertFirstCircularLinkedList(2);
        cllOps.insertFirstCircularLinkedList(5);
        cllOps.insertFirstCircularLinkedList(7);
        cllOps.insertFirstCircularLinkedList(2);
        cllOps.insertFirstCircularLinkedList(3);

        cllOps.printCircularLinkedList();

        System.out.println(cllOps.deleteFirstCircularLinkedList().data);
        cllOps.printCircularLinkedList();
    }
}
