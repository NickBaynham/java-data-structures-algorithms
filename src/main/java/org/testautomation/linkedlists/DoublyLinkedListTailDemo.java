package org.testautomation.linkedlists;

public class DoublyLinkedListTailDemo {
    public static void main(String[] args) {
        DoublyLinkedListWithTail<Integer> dll = new DoublyLinkedListWithTail<Integer>();
        int[] data = { 1, 3, 5, 7 };

        for (int i : data) {
            dll.insertAtHead(i);
        }
        dll.printList();
        dll.deleteAtTail();
        dll.printList();
        dll.deleteAtTail();
        dll.printList();
        System.out.println("The length of the list is: " + dll.getSize());
    }
}
