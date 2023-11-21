package homework;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    public T data;

    public Node(T data) { this.data = data; }
    public Node() { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;

    }
    public static <T> void funct1  (List<T> list1) {
        System.out.println("111");

    }
    public static <E> void swap1(List<E> list, int src, int des){};
    public static void swap(List<?> list, int src, int des){};



    public static void main(String[] args) {
       new Node<String>("").funct1(new ArrayList<String>());
       new Node<String>("").funct1(new ArrayList<Integer>());

    }
}

 class MyNode extends Node<Integer> {
    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
class ArrayBuilder {

    public static <T> void addToList (List<T> listArg, T... elements) {
        for (T x : elements) {
            listArg.add(x);
        }
    }

    public static void faultyMethod(List<String>... l) {
        Object[] objectArray = l;     // Valid

    }

}
