package org.testautomation.stacks;

public class Stack<T> {
    T[] stack;
    int top;
    int maxSize;

    /*
    Java does not allow generic type arrays. So we have used an
    array of Object type and type-casted it to the generic type V.
    This type-casting is unsafe and produces a warning.
    Comment out the line below and execute again to see the warning.
    */
    @SuppressWarnings("unchecked")
    public Stack(int size) {
        top = -1;  // indicates that the stack is empty
        maxSize = size;
        stack = (T[]) new Object[maxSize];
    }

    public int getCapacity() {
        return maxSize;
    }

    public void push(T data) {
        if (!isFull()) {
          top++;
          stack[top] = data;
        }
    }

    public T pop() {
        if (!isEmpty()) {
            T item = stack[top];
            top--;
            return item;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public T top() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty.");
        } else {
            for (int i = 0; i < top; i++) {
                System.out.print(stack[i] + "\t");
            }
            System.out.println();
        }
    }
}