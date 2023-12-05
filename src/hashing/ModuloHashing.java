package hashing;

public class ModuloHashing {
    public static int hash(int key,int N){
        return  key % N;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20,31,79,44,15};
        for (int i = 0;i< arr.length;i++) {
            arr[i] = hash(arr[i],20 );
        }
        for (int i:arr
             ) {
            System.out.println(i);
        }
    }
}
