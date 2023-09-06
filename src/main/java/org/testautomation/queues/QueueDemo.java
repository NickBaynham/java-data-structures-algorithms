package org.testautomation.queues;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(5);
        System.out.println("Current size is: " + queue.getCurrentSize());
        System.out.println("Maximum size is: " + queue.getMaxSize());
        System.out.println("Queue is full: " + queue.isFull());
        System.out.println("Queue is empty: " + queue.isEmpty());

        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
            queue.display();
        }

        for (int i = 0; i < 5; i++) {
            int result = queue.dequeue();
            queue.display();
        }
    }
}
