package others;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SomeTest {
    public static void main(String[] args) {
        NavigableSet set = new TreeSet();
        set.add("a");
        set.add("S");
        set.add("在弄");
        set.add("Sd");set.add("sdsa");set.add("sdasdasad");
        set.forEach(System.out::println);
        System.out.println(set.floor("Z"));
    }
}
