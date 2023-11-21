package lecture2;

public class MyArrayStackTest {

    public static void main(String[] args) throws MyEmptyStackException {
        MyArrayStack<Integer> arrayStack = new MyArrayStack<>();
        //System.out.println(arrayStack.pop());
        //test pop
        System.out.println(arrayStack.pop());
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        //test for top
        System.out.println(arrayStack.top());
        //arrayStack.push(8);
        //test for isEmpty()
        System.out.println(arrayStack.isEmpty());
        //test for size()
        System.out.println(arrayStack.size());
    }
}
