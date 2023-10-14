package io.datastructures.api;

import java.util.Iterator;

public interface Bag<T> extends Iterable<T> {
    void add(T t);
    boolean isEmpty();
    int size();
}
