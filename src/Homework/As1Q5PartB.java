package Homework;

import java.util.ArrayList;

public class As1Q5PartB {
    public static void main(String[] args) {
        /**ArrayList is a generic type, and array is not;
         *Array has fixed size, while ArrayList has a dynamic size;
         *An Array can both accept primitive data types and objects, while an ArrayList only accepts objects;
         *ArrayList have many built-in methods, while array doesn't have
         */
        //ArrayList is a generic type, and array is not;
        ArrayList<String> genericType = new ArrayList<>();
        ArrayList<Integer> genericType2 = new ArrayList<>();
        String[] ordinaryType = new String[100];
        genericType.add("a");
        genericType2.add(1);
        System.out.println(genericType);
        System.out.println(genericType2);
        System.out.println(ordinaryType);
        System.out.println("As you can see, the first and the second has generic type, while the third is ordinary type");



        //Array has fixed size, while ArrayList has a dynamic size;
        int[] fixedSize = new int[100];

        //you cannot change 100 to other number, if you do so, you will get an error
        ArrayList<Integer> dynamicSize = new ArrayList<>();
        dynamicSize.add(1);
        System.out.println(dynamicSize.size());
        dynamicSize.add(1);
        System.out.println(dynamicSize.size());
        System.out.println("As you can see, the size of ArrayList is dynamic.\nand you cannot change the size of array " +
                "it will throw an error");

        //An Array can both accept primitive data types and objects, while an ArrayList only accepts objects;
        Object[] objects = new Object[100];
        System.out.println(objects +" is a sample for accepting objects, while the others exists before are all primitive " +
                "data type ");
        //ArrayList have many built-in methods, while array doesn't have
        System.out.println(fixedSize+ " doesn't have built in methods like add");
        dynamicSize.add(3);
        System.out.println(dynamicSize+" has an add method, and we did it in this sample");


    }


}
