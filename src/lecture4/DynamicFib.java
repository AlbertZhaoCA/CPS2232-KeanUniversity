package lecture4;

public class DynamicFib{
    static int steps;

    public static int fibonancci(int n){
        if(n<=1) {
            steps++;
            return 1;
        }
        int last = 1;
        int nextToLast = 1;
        int answer = 1;
        for(int i = 2;i<=n;i++){
            steps++;
            answer = last + nextToLast;
            nextToLast = last;
            last = answer;
        }
        return answer;
    }

    public static void main(String[] args){
        long begin = System.nanoTime();

        System.out.println( fibonancci(40));
        System.out.println(steps + " steps taken");
        long end = System.nanoTime();
        System.out.println(end - begin);

    }
}