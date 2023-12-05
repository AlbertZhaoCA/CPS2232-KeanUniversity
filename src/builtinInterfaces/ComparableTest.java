package builtinInterfaces;

import java.util.Date;

public class ComparableTest {
    public static void main(String[] args) {
        System.out.println(new Integer(3).compareTo(new Integer(5)));//this is not an error
        System.out.println("ABC".compareTo("ABC"));
        Date date1 = new Date(2013,1,1);
        Date date2 = new Date(2012,1,1);
        System.out.println(date1.compareTo(date2));

    }
}
