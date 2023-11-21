package homework;

import java.util.Scanner;

public class As1Q3 {

    public static void displayPermutation(String s){
        displayPermutation("",s);
    }
    public static void displayPermutation(String s1,String s2){
        // base case
        if (s2 == null) {
            return;//false case
        }

        if (s2.length() == 0) {
            System.out.println(s1);//return case
        }

        for (int i = 0; i < s2.length(); i++) {
            String newS1 = s1 + s2.charAt(i);

            String newS2 = s2.substring(0, i) +
                    s2.substring(i + 1);

            displayPermutation(newS1, newS2);
        }
    }

    public static void main(String[] args) {
        //test case:
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        displayPermutation(input.nextLine());

    }
}
