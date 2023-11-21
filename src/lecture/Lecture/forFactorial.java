package lecture;

public class forFactorial {
    public static double factorial(int i){
        double returned =1;
        if(i==1||i==0)
            return 1;
        else
            for(int j=1;j<i+1;j++){
                returned *= j;
            }
        return returned;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
