package lib.dsa.stack;

public interface Stack<T extends Comparable<T>> {
    void push(T data);
    T pop() throws StackUnderflowException;
    T peek() throws StackUnderflowException;
    int getSize();
    boolean isEmpty();
}
