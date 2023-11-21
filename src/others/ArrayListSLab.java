package others;

import java.util.ArrayList;
import java.util.Arrays;
//Qinjian Zhao
public class ArrayListSLab {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(new String[]{"red", "green", "blue"}));
        System.out.println(list.get(1));
        list.add(1, "Canada");
        System.out.println(list);
        list.set(0, "Canada");
        System.out.println(list);
        list.add("black");
        System.out.println(list);
    }
}
