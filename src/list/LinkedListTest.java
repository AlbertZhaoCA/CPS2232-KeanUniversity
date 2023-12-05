package list;

public class LinkedListTest {
    public static void main(String[] args) {
        myLinkedList<String> list = new myLinkedList();
        list.display();
        list.addNode("Ken");
        list.addNode("Kean");
        list.addNode("Bob");
        list.addNode("Lisa");
        //add WKU at first and add my name at last
        list.addFirst("WKU");
        list.addLast("Albert");


    }
}
