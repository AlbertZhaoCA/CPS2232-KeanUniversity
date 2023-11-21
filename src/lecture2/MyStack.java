package lecture2;

public interface MyStack<E> {
    public int size();

    public boolean isEmpty();

    public void push(E e);

    public E top()
        throws MyQueueException;

    public E pop()
        throws MyEmptyStackException;

}
