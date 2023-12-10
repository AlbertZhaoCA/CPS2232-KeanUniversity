package list;

public class IntList {
	public int first;
	public IntList theNext;
	
	public IntList(int i,IntList L ) {
		first = i;
		theNext = L;
	}
	//two kinds of recursion
	public int size1() {
		if(this.theNext!=null)
			return 1 + this.theNext.size();		
		else {
			return 1;
		}		
	}
	public int size() {
		if(this.theNext==null)
			return 1;
		return 1 + this.size();
		
	}
	
	public int get(int i) {
		IntList p = this; 
		
		for(int j = 0;j<i;j++) {
			p = p.theNext;
		}
		
		return p.first;
	
	}
	

	public static void main(String[] args) {
		IntList aList;
		aList = new IntList(-1,null);
		for(int i = 0;i<10;i++) {
		aList = new IntList(i,aList);
		}
		System.out.println(aList.get(5));
		System.out.println(aList.first);
		
		if(aList.theNext==null) {
			System.out.println(aList.first);
			}
		
		while(aList.theNext!=null) {
		System.out.println(aList.theNext.first);
		aList.theNext = aList.theNext.theNext;
		}
		
	}

}
