package set;

public class WeightedQuickUnionDs {
    private int[] list;
    private int[] size;
    public WeightedQuickUnionDs(int i){
        this.list = new int[i];
        for(int j = 0;j<i;j++){
            list[j] = -1;
        }
    }

    //track the size
    public void connect(int i,int j){
        int sizeI = 1;
        int sizeJ = 1;
        while(list[i]>=0){
           sizeI++;
           i = list[i];
        }
        while(list[j]>=0){
            sizeJ++;
            j = list[j];
        }
        list[find(i)] -= sizeI;
        list[find(j)] -= sizeJ;
        if (list[find(i)]<0&&list[find(j)]<0&&list[find(i)]>list[find(j)])
            list[i] = find(j);
        else if (list[find(i)]<0&&list[find(j)]<0&&list[find(i)]<list[find(j)])
            list[j] = find(i);
        else if (list[find(i)]==-1&&list[find(j)]==-1)
            list[i] =list[j];

    }

    public int find(int i){
        int returned = -1;
        while(list[i]>=0){
            returned = list[i];
            i = returned;
        }

       if (list[i] <0)
            return i;
        return returned;
    }
    public boolean isConnected(int i,int j){
        return find(i)==find(j);
    }

    public static void main(String[] args) {
        WeightedQuickUnionDs List =  new WeightedQuickUnionDs(100);
        List.connect(1,2);
        List.connect(2,4);
        List.connect(4,3);
        List.connect(3,6);
        List.connect(7,5);
        System.out.println(List.isConnected(1,6));
        System.out.println(List.isConnected(1,7));
        System.out.println(List.isConnected(6,2));


    }
}
