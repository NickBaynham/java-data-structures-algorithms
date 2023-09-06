package org.testautomation.linkedlists;

public class ListDeleteDemo {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.printList();
        for (int i = 1; i <= 5; i++) {
            sll.insertAtHead(i);
            sll.printList();
        }
        sll.deleteAtHead();
        sll.printList();

        sll.deleteByValue(3);
        sll.printList();
    }
}
