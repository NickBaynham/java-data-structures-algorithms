package org.testautomation.linkedlists;

public class ListDemo2 {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.printList();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtEnd(i);
            sll.printList();
        }
    }
}
