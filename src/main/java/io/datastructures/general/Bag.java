package io.datastructures.general;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements io.datastructures.api.Bag<T> {
    private int size;
    private final List<T> items = new ArrayList<>();

    /**
     * @param t - the item to be added
     */
    @Override
    public void add(T t) {
        items.add(t);
        size++;
    }

    /**
     * @return true if the bag is empty
     */
    @Override
    public boolean isEmpty() {
        return (items.isEmpty());
    }

    /**
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<T> {
        private int i = 0;

        // Checks if the next element exists
        public boolean hasNext() {
            return i < items.size() -1;
        }

        // moves the cursor/iterator to next element
        public T next() {
            return items.get(++i);
        }

        // Used to remove an element. Implement only if needed
        public void remove() {
            // Default throws UnsupportedOperationException.
        }
    }
}
