package stack;

public class MyArrayStack <E> implements MyStack<E> {
    public static final int CAPACITY = 5;
    private E[] data;
    private int t = -1;

    public MyArrayStack(){
        this(CAPACITY);
    }
    public MyArrayStack(int capacity){
        data = (E[])new Object[capacity];
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public void push(E e) throws IllegalStateException{
        if(size()== data.length)
            throw new IllegalStateException("Empty stack");//Qinjian Zhao
        data[++t] = e;
    }

    @Override
    public E top() {
        if(isEmpty())
            return null;
        return data[t];
    }

    @Override
    public E pop()  {
        if(isEmpty())
            return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
}
