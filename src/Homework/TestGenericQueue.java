package Homework;

public class TestGenericQueue {
        public static void main(String[] args) {
            GenericQueue<Integer> myQueue = new GenericQueue<>();
            myQueue.enqueue(1);
            myQueue.enqueue(2);
            myQueue.dequeue();
            myQueue.enqueue(3);
            myQueue.enqueue(4);
            myQueue.enqueue(5);
            System.out.println(myQueue);
        }
}