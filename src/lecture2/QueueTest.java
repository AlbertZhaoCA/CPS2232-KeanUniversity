package lecture2;

public class QueueTest {

    public static void main(String[] args) throws MyQueueException {
        //PART A
        ArrayQueue<String> queue = new ArrayQueue<>();
        System.out.println(queue.isEmpty());
        //PART B
        queue.enqueue("ken");
        queue.enqueue("kean");
        queue.enqueue("ann");
        System.out.println( queue.size());
        System.out.println( queue.first());
        //PART C, it doesn't reach the CAPACITY
        queue.enqueue("Albert");
        queue.enqueue("Every friend is the best");
        System.out.println(queue.size() + "\nAND THE CAPACITY IS " + MyQueue.CAPACITY);
        //Additional test
        try{
            queue.enqueue("Full");
        }
        catch (MyQueueException ex){
            System.out.println(queue.size());;
            System.out.println(ex);
        }

    }

}
