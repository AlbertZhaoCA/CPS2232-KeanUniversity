package homework;

public class GenericQueue<E> {

        private java.util.LinkedList<E> list = new java.util.LinkedList<E>();

        public void enqueue(E e){
            list.addLast(e);
        }
        public void dequeue(){
            list.removeFirst();
        }
        public int getSize() {
            return list.size();
        }
        public String toString() {
            return "queue: " + list. toString();
        }
}
