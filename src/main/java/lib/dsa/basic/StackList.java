package lib.dsa.basic;

import lib.dsa.api.Stack;

/***
 * Last in first out (LIFO)
 * @param <T>
 */
public class StackList<T extends Comparable<T>> extends LinkedList<T> implements Stack<T> {
    public void push(T data) {
        this.addNodeToHead(data);
    }

    public T peek() {
        return getHead();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }
}
