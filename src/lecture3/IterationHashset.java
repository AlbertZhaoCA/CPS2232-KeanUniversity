package lecture3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterationHashset {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("London");
        mySet.add("Lagos");
        mySet.add("Kiev");
        mySet.add("New York");
        mySet.add("Beijing");

        Iterator<String> iter = mySet.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
