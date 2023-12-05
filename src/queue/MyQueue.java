package queue;

public interface MyQueue <E>{
    /** returns the number of elements in the queue */
    int size();

    /** returns whether the queue is empty */
    boolean isEmpty();

    /** insert a element in the enqueue */
    void enqueue(E e)
            throws MyQueueException;

    /** returns the first elements in the queue */
    E first()
            throws MyQueueException;

    /** removes and returns the first element of the queue */
    E deque()
            throws MyQueueException;

    public final int CAPACITY = 5;

}
