package others;

import java.util.Comparator;
import java.util.Iterator;

public class MyDataStructure<E> implements Iterable<E>,Comparable<E> {
    public static void main(String[] args) {
        MyDataStructure<Integer> a = new MyDataStructure();
        MyDataStructure<Integer> b = new MyDataStructure();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(0);
        b.add(0);
        Iterator<Integer> it = a.iterator();
        eleComparator ec = new eleComparator();
        System.out.println(ec.compare(a,b));
    }
    private static final int INITALSIZE = 100;
    E[] elements;
    private int size = -1;
    public MyDataStructure(){
        elements = (E[])(new Object[INITALSIZE]);
    }

    public void add(E e){
        elements[size()] = e;
        size++;
    }

    public void remove(E e){
        if(isEmpty()) System.out.println("Empty");;
        if(elements[size()-1]==e)
            size--;
    }

    public void delete(){
        if(isEmpty())
            System.out.println("Empty");
        else
            size--;
    }

    public int find(E e){
        int pos = 0;
        if (isEmpty()&& e == null)
            return 0;
        else if (isEmpty())
            return -1;
        else {
            while(elements[pos]!=null){
            if(elements[pos] == e)
                return pos;
            pos++;
            }
        }

        return -1;
    }

    public boolean isEmpty(){
        return size == -1;
    }

    public int size(){
        return size+1;
    }


    @Override
    public Iterator<E> iterator() {
        return new iterators();
    }

    @Override
    public int compareTo(Object o) {
        return size()-((MyDataStructure)o).size();
    }

    private static class eleComparator implements Comparator<MyDataStructure>{

        @Override
        public int compare(MyDataStructure o1, MyDataStructure o2) {
            return (int)o1.elements[0] - (int)o2.elements[0];
        }
    }

    private class iterators implements Iterator<E>{
        int p = -1;

        @Override
        public boolean hasNext() {
            return p<size;
        }

        @Override
        public E next() {
            p++;
            return (E)elements[p];
        }
    }
}

