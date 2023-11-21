package list;

public class SLList {
    public IntNode first;
    
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    
    public SLList(int x) {
        first = new IntNode(x, null);
    }
    
 

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }
    
    public void addLast(int x) {
    	IntNode p = first;
    	while(p.next!=null) {
    		p = p.next;
    	}
    	
    	p.next = new IntNode(x, null);
    	
    }
    private static int size(IntNode p) {
    	if(p.next==null)
    		return 1;
    	else 
    		return 1 + size(p.next);
    	
    }
     
    public int size() {
    	return size(first);
    }
    
    public static void main(String[] args) {
    	SLList aList = new SLList(1);
    	aList.addFirst(2);
    	aList.addFirst(3);
    	aList.addLast(4);
    	System.out.print(aList.first.item);
    }
}

