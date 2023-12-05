package hashing;

public class HashCodeLongType {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("BitWise x^y = " + (x^y));
        System.out.println("BitWise x|y = " + (x|y));
        long key = 1234567890000001024l;
        int hashcode = (int)(key^(key>>32));
        System.out.println("hashcode of key as the type = " + hashcode);
    }
}
