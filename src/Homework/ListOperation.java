package Homework;

import java.util.ArrayList;

public class ListOperation {
    //the list described in the question
    public static ArrayList<Integer> aList;
    //find method, which can return the index by the position counted
    public static int find(int n){
        int position = 0;
        for (int i =0;i<aList.size();i++){
            if (aList.get(i)==n)
                return position;
            else
                position++;
        }
        return -1;
    }
    //replace method, which use the find method and change the number in that index to -1
    public static ArrayList<Integer>  replace(int n){
        aList.set(find(n),-1);
        return aList;

    }

    public static void main(String[] args) {
        //instantiate the list described in the question
        aList = new ArrayList<>();
        aList.add(34);
        aList.add(12);
        aList.add(52);
        aList.add(16);
        aList.add(12);
        //test
        replace(16);
        System.out.println(find(52));
        System.out.println(aList);
    }
}
