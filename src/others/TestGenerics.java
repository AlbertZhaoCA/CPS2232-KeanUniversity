package others;

import java.util.ArrayList;
import java.util.Date;

public class TestGenerics<E> {
    public static void main(String[] args) {
       /* ArrayList dates = new ArrayList();
        dates.add(new Date());
        dates.add(new String());
        System.out.println(dates);
        dates.add(new Date());
        //Date date2 = dates.get(0);//cannot run, cause the 0 position is an object
*/
        ArrayList<Date> newDates = new ArrayList<>();
        newDates.add(new Date());
        //newDates.add(new String());
        System.out.println("Generic type Date:" + newDates);
        Date date3 = newDates.get(0);
        System.out.println("Date object: " + date3);

    }

    static <E> E returnE(E e){
        return e;
    }

}
