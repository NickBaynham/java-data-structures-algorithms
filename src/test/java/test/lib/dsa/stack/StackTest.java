package test.lib.dsa.stack;

import lib.dsa.stack.Element;
import lib.dsa.stack.LinkedListStack;
import lib.dsa.stack.Stack;
import lib.dsa.stack.StackUnderflowException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StackTest {
    @Test
    void testElement() {
        Element<Integer> element = new Element<>(42, null);
        assertThat(element).isNotNull();
        assertThat(element.getNext()).isNull();
        assertThat(element.getData()).isEqualTo(42);

        element.setData(100);
        element.setNext(element);
        assertThat(element).isNotNull();
        assertThat(element.getData()).isEqualTo(100);
        assertThat(element).isEqualTo(element);
    }

    @Test
    void testStack() throws StackUnderflowException {
        int[] data = { 5, 4, 9, 1, 31, 205 };
        Stack<Integer> stack = new LinkedListStack<>();
        System.out.println("Is the stack empty? " + stack.isEmpty());
        assertThat(stack.getSize()).isEqualTo(0);
        for (int item : data) {
            stack.push(item);
            System.out.println("Stack size is " + stack.getSize());
            System.out.println("Top item on the stack is " + stack.peek());
        }

        while (! stack.isEmpty()) {
            int item = stack.pop();
            System.out.println("Popped " + item);
            System.out.println("Stack size is " + stack.getSize());
            System.out.println("Is Stack Empty? " + stack.isEmpty());
        }
    }
}
