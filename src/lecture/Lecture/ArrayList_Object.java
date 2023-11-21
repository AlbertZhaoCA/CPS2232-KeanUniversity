package lecture;

public class ArrayList_Object<E> {
    public static <E> void arrayMethod(E[] array){
        for (int i = 0;i< array.length;i++)
            System.out.println(array[i]);
    }


}
