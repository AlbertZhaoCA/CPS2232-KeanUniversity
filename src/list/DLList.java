package list;

public class DLList<E>  {

/*	class ListIterator implements Iterator{
		@Override
		public boolean hasNext() {
			return frontSentinel.next!=behindSentinel;
		}

		@Override
		public Object next() {
			return frontSentinel;
		}
	}*/
	public Node aSentinel;
	public int size = -1;

/*	public Iterator iterator() {
		return new ListIterator();
	}*/

	//sentinel --> 2 -->3 -->2 -->4 -->sentinel
	public void removeDuplicate(){
		Node ref = aSentinel;

		while(ref.next!=aSentinel){
			Node judge = ref.next;
			while(judge!=aSentinel){
				if(judge.item == ref.item){
					remove(judge);
				}
				judge = judge.next;
			}
			ref = ref.next;
		}
	}



	public class Node{
		public Node prev;
		public Node next;
		public E item;
		
		public Node() {
		}
		
		public Node(E x,Node aNode,Node theOther) {
			item = x;
			prev = aNode;
			next = theOther;
		}
	}
	
	public DLList() {
		aSentinel = new Node();
		aSentinel.next = aSentinel;
		aSentinel.prev = aSentinel;
	}
	
	public DLList(E x) {
		this();
		size++;
		aSentinel.next = new Node(x,aSentinel,aSentinel);
		aSentinel.prev = aSentinel.next;

	}
	public void addLast(E x) {
		size++;
		Node added = new Node(x,aSentinel.prev,aSentinel);
		aSentinel.prev.next = added;
		aSentinel.prev = added;
	}

	public int size() {
		return size + 1;
	}

	public boolean isEmpty(){
		return size ==-1;
	}
	//sentinel --> 2 -->3 -->2 -->4 -->sentinel
	public void print(){
		Node newPrinted = aSentinel;
		while(newPrinted.next!=aSentinel){
			System.out.print(newPrinted.next.item + " --> "  );
			newPrinted = newPrinted.next;
		}System.out.print("null"  );
	}
	public void remove(Node n){
		n.prev.next = n.next;
		n.next.prev = n.prev;
	}

	public void remove(E e){
		Node ref = aSentinel;
		while(ref.next!=aSentinel){
			if (e == ref.next.item){
				remove(ref.next);
			}
			ref = ref.next;
		}
	}

	public static void main(String[] args) {
		DLList aList = new DLList();
		aList.addLast("Albert");
		aList.addLast("赵钦鉴");
		aList.addLast("赵钦鉴");
		aList.addLast("Albert");
		aList.addLast("赵钦鉴");
		aList.addLast("AlbertZhao");
		aList.addLast("Albert");
		aList.addLast("赵钦鉴");


		aList.remove("赵钦鉴");
		System.out.println(aList.size());
		aList.print();


	}

}
