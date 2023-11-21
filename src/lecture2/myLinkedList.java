package lecture2;

public class myLinkedList<E>  {
    //represent a node of the singly linked list

    private class Node{
        E data;
        Node next;

        public Node(E e){
            this.data = e;
            this.next = null;
        }
    }//end inner class Node

    //represent the head and tail of singly linked list
    public Node head =null;
    public Node tail  =null;
    int size;

    public void addNode(E e){
        Node newNode = new Node(e);

        if(head ==null){
            size++;
            head = newNode;
            tail = newNode;
        }
        else {
            ++size;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public  void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current!=null){
            System.out.print(current.data +"-->");
            current = current.next;
        }
        System.out.println();
    }
    public void addFirst(E e){
        ++size;
        Node aNew = new Node(e);
        aNew.next = head;
        head = aNew;
    }

    public void addLast(E e){
        ++size;
        Node aNew = new Node(e) ;
        tail.next = aNew;
        tail = aNew;
    }
    //return the ith items
    public E get(int i){
        int count = 1;
        Node aNode = head;
        while(aNode.next!=null){
            count++;
            aNode = aNode.next;
            if(count==i)
                return aNode.data;

        }
            return aNode.data;
    }
    public int size(){
        return size;
    }


}
