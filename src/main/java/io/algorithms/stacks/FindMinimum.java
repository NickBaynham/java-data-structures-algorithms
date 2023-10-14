package io.algorithms.stacks;

import lib.dsa.stack.Element;
import lib.dsa.basic.LinkedList;
/***
 * Find the minimum element in a stack in constant time
 */
public class FindMinimum<T extends Comparable<T>> extends LinkedList<T> {
    public static void main(String[] args) {
        FindMinimum<Integer> findMinimum = new FindMinimum<>();
        int[] data = { 1, 5, 33, 91, -40, 33, -20, 66 };
        for (int value : data) {
            findMinimum.addNodeToHead(value);
        }
        System.out.println(" The minimum is " + findMinimum.findMin());

    }
    public T findMin() {
        T minimum = head.getData();
        Node<T> current = head;
        while (current != null) {
            if (current.getData().compareTo(minimum) < 0) {
                minimum = current.getData();
            }
            current = current.getNext();
        }
        return minimum;
    }
}
