package test.lib.dsa.basic;

import lib.dsa.api.Stack;
import lib.dsa.basic.LinkedList;
import lib.dsa.basic.StackList;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class LinkedListTest {
    @Test
    void testCountNodes() {
        int[] data = { 21, 33, 42, 55, 71 };

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int value : data) {
            linkedList.addNodeToHead(value);
        }
        assertThat(linkedList.getSize()).isEqualTo(data.length);
    }

    @Test
    void testStack() {
        String[] data = { "John", "Dan", "Scott", "Jason", "Raven" };
        Stack<String> stack = new StackList<>();
        for (String item : data) {
            stack.push(item);
            System.out.println("Pushing: " + item);
            System.out.println("Size of Stack is " + stack.getSize());
        }
        assertThat(stack.getSize()).isEqualTo(data.length);
        while (stack.getSize() > 0) {
            System.out.println("The next item is " + stack.peek());
            String name = stack.pop();
            System.out.println("Popped " + name);
            System.out.println("Size of Stack is " + stack.getSize());
            System.out.println("Stack empty? " + stack.isEmpty());
        }
        assertThat(stack.getSize()).isEqualTo(0);
        assertThat(stack.isEmpty()).isTrue();
    }
}