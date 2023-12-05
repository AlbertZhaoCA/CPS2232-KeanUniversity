package algorithmAnalysis;

public class LogarithmTimeComplexity {
    public static void main(String[] args) {
        int result = 1;
        int n = 8;
        int a = 2;

        for (int i = 1; i <= n; i++) {
            result *= a;
        }

        int k = 3;
        result = a;
        for (int i = 1; i <= k; i++) {
            result = result * result;
        }

    }
}
