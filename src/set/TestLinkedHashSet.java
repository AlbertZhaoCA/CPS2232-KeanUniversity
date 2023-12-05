package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> mySet = new LinkedHashSet<>();
        mySet.add("London");
        mySet.add("Paris");
        mySet.add("New York");
        mySet.add("San Fran");
        mySet.add("Beijing");
        mySet.add("New York");
        System.out.println(mySet);
        for (String element:mySet
             ) {
            System.out.print(element.toLowerCase()+ " ");
        }
    }
}
