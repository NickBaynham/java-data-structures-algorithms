package lib.dsa.api;

import lib.dsa.queue.QueueOverflowException;
import lib.dsa.queue.QueueUnderflowException;

/***
 * Remove the elements from the beginning and add elements to the end (FIFO/LILO)
 * @param <T>
 */
public interface Queue<T extends Comparable<T>> {
    T dequeue() throws QueueUnderflowException;
    void enqueue(T data) throws QueueOverflowException;

    T peek();

    int getSize();
    boolean isEmpty();

    boolean isFull();
}
