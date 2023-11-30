package lecture4;

public class FibonacciNumberRecursiveCalls {
    static int stepsTaken = 0;
    public static void main(String[] args){
        int n = 11;
        long begin = System.nanoTime();
        System.out.println("Fib(" + n + " ) = " +fib(n));
        long end  = System.nanoTime();
        System.out.println("Time taken:" + (end-begin));
        System.out.println("StepTaken " +stepsTaken);


    }

    public static int fib(int num){
        ++stepsTaken;
        if(num == 0)return 0;
        if (num == 1||num==2) {
            return 1;
        }
        else{
            return fib(num-1) + fib(num -2);
        }
    }
}
