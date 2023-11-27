package lecture3;

public class HashTableTest {
    public static void main(String[] args) {
        int[] key = {1, 12, 42, 4, 14, 17, 13, 37};
        hash(key, 11);
    }

    static void hash(int[] ints,int n){

        for (int i = 0;i<ints.length;i++) {
            int index= ints[i] % n;
            System.out.println(index);
    
        }

    }
}
