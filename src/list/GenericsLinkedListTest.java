package list;

public class GenericsLinkedListTest {
    public static void main(String[] args) {
        myLinkedList<Integer> intList = new myLinkedList<>();
        intList.addNode(5);
        intList.addNode(-8);
        intList.addNode(2);
        intList.addNode(1);
        intList.addNode(8);
        intList.addNode(6);
        intList.display();

        //add at the beginning
        intList.addFirst(80);
        intList.display();
        //add at the last
        intList.addLast(122);
        intList.display();
    }
}
