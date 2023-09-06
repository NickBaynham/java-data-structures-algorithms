package org.testautomation.stacks;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.display();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            stack.display();
        }
        for (int i = 0; i < 5; i++) {
            int value = stack.pop();
            stack.display();
        }

    }
}
