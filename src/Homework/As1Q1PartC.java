package Homework;

//use for loop to do the fibonaqch
public class As1Q1PartC{
    //f(0)=1,f(1)=1,f(n)=f(n-1)+f(n-2)
    public static double fib(int n){
        //use double here,because we will test n==100
        double returned = 0;
        double preceded = 1;
        double latter = 1;

        if(n==1||n==2)
            return 1;

        else{
            for(int i =0;i<n-2;i++){
                returned = preceded + latter;
                latter = preceded;
                preceded = returned;
            }
            return returned;
        }
    }
    //test for n==11 and n==100
    public static void main(String[] args){
        System.out.println(fib(11));
        System.out.println(fib(100));
    }
}