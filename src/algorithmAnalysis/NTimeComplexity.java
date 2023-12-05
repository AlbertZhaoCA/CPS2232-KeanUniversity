package algorithmAnalysis;

public class NTimeComplexity {
    static int steps;
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] sum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sumFirstTwentyNum = 0;
        for (int i = 0; i < sum.length; i++) {
            steps++;
            sumFirstTwentyNum += sum[i];
        }
        System.out.println(sumFirstTwentyNum);
        long endTime = System.nanoTime();
        System.out.println(steps);
        System.out.println(endTime-startTime);
    }
}
