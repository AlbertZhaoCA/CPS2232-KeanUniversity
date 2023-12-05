package hashing;

public class supplementalHash {
    public static void main(String[] args) {
        System.out.println(supplementalHash(101));
        System.out.
                println(supplementalHash(205));
        System.out.println(101&3);
        System.out.println(205&3);
    }
    private static int supplementalHash(int h){
        h ^= (h>>>20) ^ (h>>>12);
        return h ^ (h>>>7) ^ (h>>>4);
    }
}
