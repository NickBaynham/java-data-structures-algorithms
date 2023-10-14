package lib.dsa.basic;

/***
 * Stores a list of elements without a fixed length
 * This is academic - you wouldn't usually implement a list of your own since Java has an implementation in
 * LinkedList and ArrayList
 *
 * For Java, LinkedList is not a favorite interview question because they are straightforward to use.
 *
 * Advantages
 * - Size does not need to be known upfront, grows dynamically (use when you don't know how large the data should be)
 * - Insertions and deletions in a sequence are easier than arrays (optimized for large number of insert or delete)
 *
 * Disadvantages
 * - More expensive to randomly access a specific node, arrays are O(1) to access elements (Arrays better choice here)
 * - Cannot take advantage of spacial locality for caching (read operations slower than Arrays)
 */
public class LinkedList<T extends Comparable<T>> implements Cloneable {
    protected Node<T> head;
    private int size;

    /***
     * O(n)
     * @param data - the value to search for
     * @return true if the element is found in the list
     */
    public boolean hasValue(T data) {
        Node<T> current = head;
        while (current.getNext() != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public T getHead() {
        return head.getData();
    }

    /***
     * O(1)
     * @param data - the element to add to the list
     */
    public void addNodeToHead(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    /***
     * O(n)
     * @param data - the value to add to the list
     */
    public void addNodeToTail(T data) {
        size++;
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    /***
     * O(n)
     * @param data - value to delete from the list
     */
    public void delete(T data) {
        Node<T> previous = head;
        Node<T> current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                previous.setNext(current.getNext());
                size--;
                return;
            }
            previous = current;
            current = current.getNext();
        }
    }

    /***
     * O(1)
     */
    public void deleteHead() {
        size--;
        head = head.getNext();
    }

    public int getSize() {
        return size;
    }

    public int calculateSize() {
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    @Override
    public LinkedList<T> clone() {
        try {
            LinkedList clone = (LinkedList) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    protected static class Node<T extends Comparable<T>> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public T getData() {
            return data;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

    }
    public T pop() {
        if (head == null) {
            return null;
        } else {
            size--;
            Node<T> firstNode = head;
            head = head.getNext();
            return firstNode.data;
        }
    }
}