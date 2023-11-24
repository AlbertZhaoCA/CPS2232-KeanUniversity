package lecture5;

public class GreatestCommonDivisor1 {
    static long startTime;
    static long endTime;

    public static int gcd(int m, int n) {
        int gcd = 1;
        int stepTaken = 0;

        startTime = System.nanoTime();
        for (int k = 2; k <= m && k <= n; k++) {
            System.out.println("Linear Time step: " + (stepTaken = stepTaken + 1));
            if (m % k == 0 && n % k == 0)
                gcd = k;
                endTime = System.nanoTime();

            }
            System.out.println("Execution Time: " + (endTime - startTime));
            return gcd;
        }

    public static void main (String[]args){
        int x = 270;
        int y = 192;
        System.out.println("GCD is " + gcd(x, y));
    }


}

