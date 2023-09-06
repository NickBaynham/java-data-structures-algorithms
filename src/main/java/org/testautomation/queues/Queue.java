package org.testautomation.queues;

public class Queue<T> {
    private int front;
    private int back;
    private final int maxSize;
    private int currentSize;
    private final T[] array;

    @SuppressWarnings("unchecked")
    public Queue(int size) {
        maxSize = size;
        front = 0;
        back = -1;
        currentSize = 0;
        array = (T[]) new Object[size];
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void enqueue(T data) {
        if (isFull()) {
            return;
        }

        back = (back + 1) % maxSize;
        array[back] = data;
        currentSize++;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }

        T temp = array[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return temp;
    }

    public T top() {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The Queue is empty.");
        } else {
            for (int i = front; i < back; i++) {
                System.out.print(array[i] + "\t");
            }
            System.out.println();
        }
    }
}