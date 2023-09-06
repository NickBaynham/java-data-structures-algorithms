package org.testautomation.linkedlists;

public class DoublyLinkedListWithTail<T> {
    public class Node {
        public T data;
        public Node prevNode;
        public Node nextNode;
    }

    public Node headNode;
    public Node tailNode;
    public int size;

    public boolean isEmpty() {
        return headNode == null && tailNode == null;
    }

    public Node getHeadNode() {
        return headNode;
    }

    public Node getTailNode() {
        return tailNode;
    }

    public int getSize() {
        return size;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        if (!isEmpty()) {
            headNode.prevNode = newNode;
        } else {
            tailNode = newNode;
        }
        headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.prevNode = tailNode;
        tailNode.nextNode = newNode;
        tailNode = newNode;
        size++;
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
        node.prevNode = current;
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
        if (headNode == null) {
            tailNode = null;
        } else {
            headNode.prevNode = null;
        }
        size--;
    }

    public void deleteAtTail() {
        if (isEmpty()) {
            return;
        }
        tailNode = tailNode.prevNode;
        if (tailNode == null) {
            headNode = null;
        } else {
            tailNode.nextNode = null;
        }
        size--;
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

    public void deleteByValue(T data) {
        if (isEmpty()) {
          return;  
        }
        
        Node currentNode = headNode;
        
        if (currentNode.data.equals(data)) {
            deleteAtHead();
            return;
        }
        
        while (currentNode != null) {
            if (data.equals(currentNode.data)) {
                currentNode.prevNode.nextNode = currentNode.nextNode;
                if (currentNode.nextNode != null) {
                    currentNode.nextNode.prevNode = currentNode.prevNode;
                }
                size--;
            }
            currentNode = currentNode.nextNode;
        }
    }
}