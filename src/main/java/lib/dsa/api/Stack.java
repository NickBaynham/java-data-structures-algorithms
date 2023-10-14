package lib.dsa.api;

public interface Stack<T extends Comparable<T>> {
    void push(T data);
    T pop();
    T peek();
    int getSize();
    boolean isEmpty();
}
