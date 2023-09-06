package org.testautomation.linkedlists;

public class ListDemo3 {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.printList();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtEnd(i);
            sll.printList();
        }
        sll.insertAfter(23, 4);
        sll.printList();
    }
}
