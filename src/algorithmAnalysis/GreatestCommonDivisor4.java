package algorithmAnalysis;

public class GreatestCommonDivisor4 {

    static long startTime;
    static long endTime;
    static int stepTaken;

    public static int gcd(int m, int n) {


        startTime = System.nanoTime();
        if(m % n == 0) {
            System.out.println("Linear Time step: " + (++stepTaken));
            return n;
        }else {
            System.out.println("Linear Time step: " + (++stepTaken));
            return gcd(n, m % n);
        }


    }
    public static void main (String[]args){
        int x = 270;
        int y = 192;
        System.out.println("GCD is " + gcd(x, y));
        endTime = System.nanoTime();
        System.out.println("Execution Time: " + (endTime - startTime));

    }


}

