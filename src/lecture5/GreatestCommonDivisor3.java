package lecture5;

public class GreatestCommonDivisor3 {
    static long startTime;
    static long endTime;

    public static int gcd(int m, int n) {
        int gcdResult = 1;
        int stepTaken = 0;

        startTime = System.nanoTime();
        if(m == n)
            return m;
        for (int k = m/2; k >= 1; k--) {
            System.out.println("Linear Time step: " + (++stepTaken ));
            if (m % k == 0 && n % k == 0) {
                gcdResult = k;
                break;
            }
        }
        endTime = System.nanoTime();
        return gcdResult;
    }
    public static void main (String[]args){
        int x = 270;
        int y = 192;
        System.out.println("GCD is " + gcd(x, y));
        System.out.println("Execution Time: " + (endTime - startTime));

    }


}
