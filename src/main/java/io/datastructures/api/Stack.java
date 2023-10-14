package io.datastructures.api;

public interface Stack<T> extends Iterable<T> {
    void push(T t);
    T pop();
    boolean isEmpty();
    int size();
}
