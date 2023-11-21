package List;

import java.util.Iterator;

public class DLList {
	public Node aSentinel;
	public int size;
	public Node frontSentinel;
	public Node behindSentinel;
	public Node last;
	public Node head;

	public static class Node{
		public Node prev;
		public Node next;
		public int item;
		
		public Node() {

		}
		
		public Node(int x,Node aNode,Node theOther) {
			item = x;
			prev = aNode;
			next = theOther;
		}
	}
	
	public DLList() { 
		aSentinel = new Node();
		frontSentinel = new Node();
		behindSentinel= new Node();
		frontSentinel.prev = behindSentinel;
		behindSentinel.next = frontSentinel;
		last = behindSentinel;
		head = frontSentinel;
		
	}
	
	public DLList(int x) {
		this();
		Node added = new Node(x,frontSentinel,behindSentinel);
		frontSentinel.next = added;
		behindSentinel.prev =added;
		size++;
		head = frontSentinel.next;
	}
	public void addLast(int x) {
		Node added = new Node(x,head,behindSentinel);
		last.prev = added;
		head.next = added;
		size++;
		head = added;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		DLList aList = new DLList(3);
		for(int i = 0;i<10000000;i++){
		aList.addLast(i);}
		System.out.println(aList.size());
	}

}
