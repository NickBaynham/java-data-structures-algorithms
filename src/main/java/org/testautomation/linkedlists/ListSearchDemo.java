package org.testautomation.linkedlists;

public class ListSearchDemo {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insertAtEnd(5);
        singlyLinkedList.insertAtEnd(90);
        singlyLinkedList.insertAtEnd(10);
        singlyLinkedList.insertAtEnd(4);

        singlyLinkedList.printList();
        boolean result = singlyLinkedList.searchNode(4);
        System.out.println(result);
    }
}
