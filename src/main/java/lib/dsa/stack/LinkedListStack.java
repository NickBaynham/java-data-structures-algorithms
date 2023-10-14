package lib.dsa.stack;

public class LinkedListStack<T extends Comparable<T>> implements Stack<T>, Cloneable {

    protected Element<T> top;
    private int size;

    /**
     * @param data - the value to push onto the stack
     */
    @Override
    public void push(T data) {
        top = new Element<>(data, top);
        size++;
    }

    /**
     * @return the value of top element of the stack with removal
     */
    @Override
    public T pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        } else {
            T data = top.getData();
            top = top.getNext();
            size--;
            return data;
        }
    }

    /**
     * @return the value at the top of the stack without removal
     */
    @Override
    public T peek() throws StackUnderflowException {
        if (isEmpty()) throw new StackUnderflowException();
        return top.getData();
    }

    /**
     * @return the size of the stack
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * @return true if the stack is empty
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
