package io.datastructures.strawman;

import org.testautomation.arrays.PositiveNegative;

public class FixedCapacityStack {
    private final String[] data;
    private int size;

    public void push(String s) {
        if (size < data.length) {
            data[size++] = s;
        }
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        } else {
            return data[--size];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public FixedCapacityStack(int capacity) {
        data = new String[capacity];
    }

    public static void main(String[] args) {
        FixedCapacityStack fixedCapacityStack = new FixedCapacityStack(5);
        boolean empty = fixedCapacityStack.isEmpty();
        System.out.println("Is the stack empty? " + empty);
        fixedCapacityStack.push("One");
        fixedCapacityStack.push("Two");
        fixedCapacityStack.push("Three");
        fixedCapacityStack.push("Four");
        fixedCapacityStack.push("Five");
        empty = fixedCapacityStack.isEmpty();
        System.out.println("Is the stack empty? " + empty);

        System.out.println("Watch out! I've pupped " + fixedCapacityStack.pop());
        empty = fixedCapacityStack.isEmpty();
        System.out.println("Is the stack empty? " + empty);
        System.out.println("Watch out! I've pupped " + fixedCapacityStack.pop());
        empty = fixedCapacityStack.isEmpty();
        System.out.println("Is the stack empty? " + empty);
        System.out.println("Watch out! I've pupped " + fixedCapacityStack.pop());
        empty = fixedCapacityStack.isEmpty();
        System.out.println("Is the stack empty? " + empty);
        System.out.println("Watch out! I've pupped " + fixedCapacityStack.pop());
        empty = fixedCapacityStack.isEmpty();
        System.out.println("Is the stack empty? " + empty);
        System.out.println("Watch out! I've pupped " + fixedCapacityStack.pop());
        empty = fixedCapacityStack.isEmpty();
        System.out.println("Is the stack empty? " + empty);
        System.out.println("Watch out! I've pupped " + fixedCapacityStack.pop());
        empty = fixedCapacityStack.isEmpty();
        System.out.println("Is the stack empty? " + empty);
    }
}
