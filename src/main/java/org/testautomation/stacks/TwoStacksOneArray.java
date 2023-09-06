package org.testautomation.stacks;

public class TwoStacksOneArray<T> {

    public static void main(String[] args) {
        TwoStacksOneArray<Integer> twoStacksOneArray = new TwoStacksOneArray<>(10);
        System.out.println("Stack (1) Empty: " + twoStacksOneArray.isStackEmpty(1));
        System.out.println("Stack (2) Empty: " + twoStacksOneArray.isStackEmpty(2));

        for (int i = 0; i < 4; i++) {
            twoStacksOneArray.push1(i);
            twoStacksOneArray.display();
        }

        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < 6; i++) {
            twoStacksOneArray.push2(i);
            twoStacksOneArray.display();
        }

        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            int result = twoStacksOneArray.pop1();
            twoStacksOneArray.display();
        }

        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < 6; i++) {
            int result = twoStacksOneArray.pop2();
            twoStacksOneArray.display();
        }
    }

    T[] array;
    int maxSize, top1, top2, currentSize1, currentSize2;

    @SuppressWarnings("unchecked")
    TwoStacksOneArray(int size) {
        maxSize = size;
        array = (T[]) new Object[size];
        top1 = -1;
        top2 = size;
    }

    private boolean isStackEmpty(int stack) {
        if (stack == 1) {
            return top1 == -1;
        } else {
            return top2 == maxSize;
        }
    }

    private boolean isStackFull() {
        return (currentSize1 + currentSize2) == maxSize;
    }

    void display() {
        if (isStackEmpty(1)) {
            System.out.println("Stack 1 is empty.");
        } else {
            for (int i = 0; i < currentSize1; i++) {
                System.out.print(array[i] + "\t");
            }
            System.out.println();
        }

        if (isStackEmpty(2)) {
            System.out.println("Stack 2 is empty.");
        } else {
            for (int i = top2; i < maxSize; i++) {
                System.out.print(array[i] + "\t");
            }
            System.out.println();
        }

        System.out.println("Stack Full: " + isStackFull());
    }
    void push1(T data) {
        if (!isStackFull()) {
            array[++top1] = data;
            currentSize1++;
        }
    }

    void push2(T data) {
        if (!isStackFull()) {
            array[--top2] = data;
            currentSize2++;
        }
    }

    T pop1() {
        if (!isStackEmpty(1)) {
            currentSize1--;
            return array[top1--];
        } else {
            return null;
        }
    }

    T pop2() {
        if (!isStackEmpty(2)) {
            currentSize2--;
            return array[top2++];
        } else {
            return null;
        }
    }
}
