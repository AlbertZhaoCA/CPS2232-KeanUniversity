package lecture3;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("London");
        mySet.add("Lagos");
        mySet.add("Kiev");
        mySet.add("New York");
        mySet.add("Beijing");
        mySet.add("New York");
        System.out.println(mySet);
        for (String s: mySet){
            System.out.print(s.toUpperCase() + " ");
        }
        System.out.println();
        mySet.forEach(e-> System.out.print(e.toLowerCase()+ " "));
    }
}
