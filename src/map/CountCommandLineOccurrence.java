package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCommandLineOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your input: ");
        String string = input.nextLine().replaceAll("\\s+","").replaceAll("\\r\\n+","");
        string = string.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        char[] words = string.toCharArray();
        //this edition only count the duplicated characters
        for (int i = 0;i< words.length;i++){
            char key = words[i];
            if(key == ' ')
                continue;

                if (!map.containsKey(key)) {
                    map.put(key,1);
                }
                else {
                    int value = map.get(key);
                    value++;
                    map.put(key,value);
                }
            }
            //map.entrySet().stream().sorted(Map.Entry<Character,Integer>.comparingByValue().reversed()).limit(5);
        map.forEach((k,v)-> {
            if(v>1)
            System.out.println(k + "\t" + v)
        ;});input.close();
    }
}
