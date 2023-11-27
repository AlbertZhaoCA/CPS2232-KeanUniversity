package lecture1;

import java.util.Scanner;

public class RecursiveStackInt {
    public static void main(String[] args) {
        recursiveStack();
    }
    public static void recursiveStack(){
        Scanner input = new Scanner(System.in);
        String enterChar = input.next();
        if(enterChar.equals("*"))
            System.out.println("End CLI input");
        else
            recursiveStack();
        System.out.println(enterChar);
        input.close();
    }


}
