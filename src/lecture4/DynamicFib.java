package lecture4;

public class DynamicFib{

    public static int fibonancci(int n){
        if(n<=1)return 1;

        int last = 1;
        int nextToLast = 1;
        int answer = 1;
        for(int i = 2;i<=n;i++){
            answer = last + nextToLast;
            nextToLast = last;
            last = answer;
        }
        return answer;
    }

    public static void main(String[] args){
        long begin = System.nanoTime();
        fibonancci(11);
        long end = System.nanoTime();
        System.out.println(end - begin);

    }
}