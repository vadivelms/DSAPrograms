package org.linkedlist.singlylinkedlist;

public class SindlyLinkedListOperations {


    public static void deleteFirst(SindlyLinkedList sll) {
        if (sll.head == null) {
            return;
        }
        ListNode newHead = sll.head.next;
        sll.head = newHead;
        return;
    }

    public static ListNode deleteLast(SindlyLinkedList sll) {
        if (sll.head == null || sll.head.next == null) {
            return sll.head;
        }
        ListNode current = sll.head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public static void deleteAtPosition(SindlyLinkedList sll, int position) {
        if (position == 1) {
            sll.head = sll.head.next;
        }
        int count = 1;
        ListNode current = sll.head;
        while (count++ < position - 1) {
            current = current.next;
        }
        current.next = current.next.next;

    }

    public static void printSll(SindlyLinkedList sll) {
        int lengthOfSll = 0;
        ListNode current = sll.head;
        while (current != null) {
            lengthOfSll++;
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println("lengthOfSll : " + lengthOfSll);
    }

    public static void printSll(ListNode head) {
        int lengthOfSll = 0;
        ListNode current = head;
        while (current != null) {
            lengthOfSll++;
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println("lengthOfList : " + lengthOfSll);
    }

    public static void insertNodeAtBeggning(SindlyLinkedList sll, ListNode newNode) {
        newNode.next = sll.head;
        sll.head = newNode;
    }

    public static void insertNodeAtEnd(SindlyLinkedList sll, ListNode newNode) {

        if (sll.head == null) {
            sll.head = newNode;
            return;
        }
        ListNode current = sll.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void insertNodeAtGivenPosition(SindlyLinkedList sll, ListNode newNode, int position) {
        int positionCount = 1;
        if (position == 1) {
            newNode.next = sll.head;
            sll.head = newNode;
            return;
        }
        ListNode previous = sll.head;
        while (positionCount < position - 1) {
            previous = previous.next;
            positionCount++;
        }
        newNode.next = previous.next;
        previous.next = newNode;

    }

    public static boolean find(ListNode head, int searchKey) {
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public static int getSize(ListNode head){
        int size=0;
        while(head!=null){
            head=head.next;
            size++;
        }

        return size;
    }
    public static boolean isPalintrom(ListNode head) {

        int lSize=getSize(head);

        ListNode current = head;
        boolean flag = true;

        // Calculate the mid-point of the list
        int mid = lSize / 2;

        // Traverse through the list until current points to the middle node
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }
        current=reverse(current);
        while (current != null) {
            if (head.data != current.data) {
                flag = false;
                break;
            }
            head = head.next;
            current = current.next;
        }

        return flag;

    }
    public static ListNode deleteNode(ListNode head, int data) {
        ListNode current = head;
        ListNode temp = null;

        if (head != null && head.data == data) {
            head = head.next;
            return head;
        }
        while (current != null && current.data != data) {
            temp = current;
            current = current.next;
        }
        if (current == null) return head;
        temp.next = current.next;
        return head;
    }

    public static boolean containsLoop(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr)
                return true;
        }

        return false;
    }

    public static ListNode createALoopInList() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = five;
        return one;
    }

    public static ListNode startNodeOfLoop(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr)
                return getStartNode(head, slowPtr);
        }

        return null;
    }

    public static ListNode getStartNode(ListNode head, ListNode slowPtr) {
        ListNode temp = head;
        while (temp != slowPtr) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }


    public static void removeLoopFromList(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr)
                removeLoop(head, slowPtr);
        }

    }

    public static void removeLoop(ListNode head, ListNode slowPtr) {
        ListNode temp = head;
        while (temp.next != slowPtr.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;

    }

    public ListNode mergeTwoSortedList(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }

        return dummy.next;
    }

    public ListNode add(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (a != null || b != null) {
            int avl = (a != null) ? a.data : 0;
            int bvl = (b != null) ? b.data : 0;
            int sum = carry + avl + bvl;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }
        if (carry > 0)
            tail.next = new ListNode(carry);
        return dummy.next;
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count = 0;
        ListNode current = list1;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        boolean flag = true;
        while (current != null) {

            if (count == a) {
                flag = false;
                while (list2 != null) {
                    tail.next = new ListNode(list2.data);
                    tail = tail.next;
                    list2 = list2.next;
                }
            }
            if (count > b) {
                flag = true;
                tail.next = current;
                break;
            }
            if (flag) {
                tail.next = new ListNode(current.data);
                tail = tail.next;
            }
            current = current.next;
            count++;
        }
        return dummy.next;
    }
}
