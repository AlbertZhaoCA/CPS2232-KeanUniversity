package lecture5;

public class FactorialComplexity {
    static int steps;
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(factorial(5));
        long endTime = System.nanoTime();
        System.out.println(steps);
        System.out.println(endTime-startTime);
    }
    public static long factorial(int n){
        if (n <=1) {
            steps++;
            return 1;
        }
        else{
            steps++;
            return n *factorial(n-1);
        }
    }

}
