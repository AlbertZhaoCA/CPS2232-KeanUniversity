package hashing;

public class HashCodeReturnFunction {
    static int n = 12;
    static int[] index;
    static int[] value;

    public static void main(String[] args) {
        int[] key = {0,4,73,44,96};
        int[] value = {34,78,21,11,-2};
        System.out.println("size is: " + key.length);
        index = hash(key,n);

        for (int k : key)
            System.out.print("Keys " + k + "");
        System.out.println();

        for (int i: index)
            System.out.println("Index " + i + "");
        System.out.println();
        displayMap(index,value);
    }
    public static int[] hash(int[] key, int n){
        int[] myKey = new int[5];
        for (int i = 0;i<key.length;i++){
            myKey[i] = key[i] % n;
        }
        return myKey;
    }

    public static void displayMap(int[] ind, int[] val){
        for (int i = 0; i < ind.length; i++){
            for (int j = 0; j<val.length;j++){
                if(i==j)
                    System.out.println(ind[i] + " " +val[j]);
            }
        }
    }
}
