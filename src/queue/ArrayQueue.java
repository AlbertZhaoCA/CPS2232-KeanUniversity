package queue;

public class ArrayQueue <E> implements MyQueue<E> {
    //instance variable
    private E[] data;
    private int f = 0;
    private int sz = 0;

    public ArrayQueue(){
        this(CAPACITY);
    }

    //constructors
    public ArrayQueue(int capacity){
        data = (E[])new Object[capacity];
    }

    @Override
    public int size() {
        return sz;
    }
    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public void enqueue(E e) throws MyQueueException {
        if(sz==data.length)throw new MyQueueException("Queue is full");
        int avail = (f+sz) % data.length;//modular arithmetic
        data[avail] = e;
        sz++;

    }

    @Override
    public E first() throws MyQueueException{
        if(isEmpty())throw new MyQueueException(" This queue is Empty, you cannot get the first");
        return data[f];
    }

    @Override
    public E deque()throws MyQueueException {
        if (isEmpty())throw new MyQueueException(" This queue is Empty, you cannot use dequeue method");
        E answer = data[f];
        data[f] = null;
        f = (f+1)% data.length;
        sz--;
        return answer;
    }


}
