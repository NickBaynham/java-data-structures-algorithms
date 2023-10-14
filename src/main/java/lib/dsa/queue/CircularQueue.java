package lib.dsa.queue;
import lib.dsa.api.Queue;

import java.lang.reflect.Array;

public class CircularQueue<T extends Comparable<T>> implements Queue<T> {
    private static final int EMPTY = -1;
    int size;
    int head = EMPTY;
    int tail = EMPTY;

    T[] data;

    @SuppressWarnings("unchecked")
    public CircularQueue(Class<T> type, int capacity) {
        data = (T[]) Array.newInstance(type, capacity);
    }

    /**
     * @return the element from the front of the queue
     */
    public T dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            T data = this.data[head];
            if (head == tail) {
                head = EMPTY;
            } else {
                head = (head + 1) % this.data.length;
            }
            size--;
            return data;
        }
    }

    /**
     *
     */
    public void enqueue(T data) throws QueueOverflowException {
        if (isFull()) {
        throw new QueueOverflowException();
        } else {
            int tail = getNextIndex();
            this.data[tail] = data;
            size++;
            if (head == EMPTY) {
                head = tail;
            }
        }
    }

    /**
     * @return - the value from the front of the queue without removal
     */
    public T peek() {
        return null;
    }

    /**
     * @return - the size of the queue
     */
    public int getSize() {
        return size;
    }

    /**
     * @return - true if the queue is empty
     */
    public boolean isEmpty() {
        return head == EMPTY;
    }

    public boolean isFull() {
        return getNextIndex() == head;
    }

    private int getNextIndex() {
        return (tail + 1) % data.length;
    }
}