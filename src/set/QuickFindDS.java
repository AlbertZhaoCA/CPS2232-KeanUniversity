package set;

import list.IntList;
public class QuickFindDS  {
    private int[] id;

    public QuickFindDS(int size){
        this.id = new int[size];
        for(int i = 0;i<size;i++){
            id[i] = i;
        }
    }

    public void connect(int p,int q){
        int pid = id[p];
        int qid = id[q];
        for(int i:id){
            if(id[i]==qid){
                id[i] = pid;
            }
        }

    }

    public boolean isConnected(int p,int q){
        return id[p] == id[q];
    }

    public static void main(String[] args) {
        QuickFindDS aSet = new QuickFindDS(100);
        aSet.connect(0,1);
        aSet.connect(2,5);
        aSet.connect(6,5);
        aSet.connect(6,7);
        System.out.println( aSet.isConnected(2,1));
        IntList aList = new IntList(1,null);

    }


}
