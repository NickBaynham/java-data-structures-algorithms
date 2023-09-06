package org.testautomation.linkedlists;

public class SinglyLinkedList<T> {
    public class Node {
        public T data;
        public Node nextNode;
    }

    public Node headNode;
    public int size;

    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (headNode == null) return true;
        return false;
    }

    public void insertAtHead(T data) {
        Node node = new Node();
        node.nextNode = headNode;
        node.data = data;
        headNode = node;
        size++;
    }

    public void insertAtEnd(T data) {
        Node node = new Node();
        node.nextNode = null;
        node.data = data;

        if (isEmpty()) {
            headNode = node;
        } else {
            Node nextNode = headNode;
            while (nextNode.nextNode != null) {
                nextNode = nextNode.nextNode;
            }
            nextNode.nextNode = node;
            size++;
        }
    }

    public void insertAfter(T data, T previous) {
        if (isEmpty()) {
            System.out.println("Node not found: " + previous);
            return;
        }

        Node current = headNode;
        while (!current.data.equals(previous) && current.nextNode != null) {
            current = current.nextNode;
        }
        if (current.data != previous) {
            System.out.println("Node not found: " + previous);
            return;
        }
        Node node = new Node();
        node.data = data;
        node.nextNode = current.nextNode;
        current.nextNode = node;
        size++;
    }

    public boolean searchNode(T data) {
        Node currentNode = headNode;
        while (!currentNode.data.equals(data) && currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        return currentNode.data == data;
    }

    public void deleteAtHead() {
        if (isEmpty()) {
            return;
        }
        headNode = headNode.nextNode;
        size--;
    }

    void deleteByValue(T data) {
        if (isEmpty()) {
            return;
        }
        Node currentNode = headNode;
        Node previousNode = null;
        while (!currentNode.data.equals(data) && currentNode.nextNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        if (!currentNode.data.equals(data)) {
            return;   // node not found
        } else {
            if (previousNode != null) {
                previousNode.nextNode = currentNode.nextNode;
                size--;
            } else {
                headNode = null;
                size = 0;
            }
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }
        Node temp = headNode;
        System.out.print("List (size: " + size +  "): ");
        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }
}
