package lib.dsa.queue;

import lib.dsa.api.Queue;
import lib.dsa.stack.LinkedListStack;
import lib.dsa.stack.Stack;
import lib.dsa.stack.StackUnderflowException;

public class TwoStackQueue<T extends Comparable<T>> implements Queue<T> {

    private Stack<T> reverseStack;
    private Stack<T> forwardStack;
    private int size;

    public TwoStackQueue() {
        forwardStack = new LinkedListStack<>();
        reverseStack = new LinkedListStack<>();
    }

    /**
     * @return an object from the head of the list
     * @throws QueueUnderflowException
     */
    @Override
    public T dequeue() throws QueueUnderflowException {
        reverseStack = new LinkedListStack<>();
        while (!forwardStack.isEmpty()) {
            try {
                reverseStack.push(forwardStack.pop());
            } catch (StackUnderflowException e) {
                throw new QueueUnderflowException();
            }
        }
        T result = null;
        try {
            result = reverseStack.pop();
        } catch (StackUnderflowException e) {
            throw new QueueUnderflowException();
        }
        forwardStack = new LinkedListStack<>();
        while (!reverseStack.isEmpty()) {
            try {
                forwardStack.push(reverseStack.pop());
            } catch (StackUnderflowException e) {
                throw new QueueUnderflowException();
            }
        }
        return result;
    }

    /**
     * @param data adds the item to the tail of the queue
     * @throws QueueOverflowException
     */
    @Override
    public void enqueue(T data) throws QueueOverflowException {
        forwardStack.push(data);
        size++;
    }

    /**
     * @return the object at the head of the list
     */
    @Override
    public T peek() {
        return null;
    }

    /**
     * @return the size of the list
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * @return true if the list is empty
     */
    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    /**
     * @return true if the list is full
     */
    @Override
    public boolean isFull() {
        return false;
    }
}