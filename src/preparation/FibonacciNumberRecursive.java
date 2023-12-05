package preparation;

//Qinjian Zhao
public class FibonacciNumberRecursive {
    static int count = 0;
    public static int fib(int n){
        if(n==0){
            count++;
            return 0;
        }
        if(n==1){
            count++;
            return 1;
        }
        else{
            count++;
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(11));
        System.out.println(count);
        count=0;
        System.out.println(fib(20));
        System.out.println(count);


    }
}
