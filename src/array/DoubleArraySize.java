package array;

import java.util.Scanner;

public class DoubleArraySize {

    public static int[] resize(int[] arr,int n){
        int[] newArr = new int[arr.length*n];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static int[] read(Scanner input,int[] myList,int n){
        for (int i = 0;i<myList.length;i++){
            int[] newList = myList;
            myList[i] = input.nextInt();
            if (myList[i] == -1) {
                System.out.println("End of input!");
                return newList;
            }
            for (int l : myList) System.out.print(l + " ");
            //doubling
            if(myList.length - 1 == i){
                    newList = resize(myList,n);
                System.out.println("\nYou increase the size by " + n + "\nAnd the size now is " + newList.length);
                for (int j = 0 ; j<myList.length;j++)newList[j] = myList[j];
                myList = newList;
            }
        }
        input.close(); return myList;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myList = new int[2];
        System.out.println("Last index " + (myList.length-1));
        System.out.println("Enter " + myList.length + " Values: ");
        System.out.println("Array is: ");
        //ask for input
        myList=read(input,myList,2);
        for (int i:
             myList) {
            System.out.print(i+",");
        }
        //show resize
        System.out.println("\nNow, we are using resizing in the main method");
        myList = resize(myList,2);
        for (int i:
                myList) {
            System.out.print(i+",");
        }


    }
}
