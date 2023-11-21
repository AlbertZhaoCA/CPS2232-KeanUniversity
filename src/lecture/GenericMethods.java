package lecture;
public class GenericMethods<E> {

    public static void main(String[] args) {
        Integer[] num = {1,2,3,4,5};
        String[] str = {"London","Paris","New York","Beijing","Amsterdam"};
        Double[] doubles ={1.2,23.2,2.2};
        GenericMethods.<Integer>display(num);
        GenericMethods.<String>display(str);
        GenericMethods.<Double>display(doubles);


    }

    public static <E> void display(E[] list){
        for (int i = 0;i< list.length;i++){
            System.out.println(list[i]+"");
        }
        System.out.println();
    }


}
