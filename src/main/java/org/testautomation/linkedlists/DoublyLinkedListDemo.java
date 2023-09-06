package org.testautomation.linkedlists;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> sll = new DoublyLinkedList<>();
        sll.printList();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtHead(i);
            sll.printList();
        }
        sll.deleteByValue(3);
        sll.printList();
    }
}
