package homework;
//compute the double summation
public class AsQ1PartB {
    public static void main(String[] args) {
        double answer = 0;
        //a nested loop
        for (int i = 1;i<5;i++){
            for (int j = 1;j<6;j++){
                answer += 2 * Math.pow(i,2);
            }
        }
        System.out.println(answer);
    }
}
