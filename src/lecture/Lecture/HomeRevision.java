package lecture;

/**
 * The largeSum program implements recursive multiply
 *
 * @author  Qinjian Zhao (1235624)
 */
public class HomeRevision {
    //use recursive to do multiply
    public static double multiply(double x,int a,int i){
        if(i==1)
            return a * Math.pow(x,i);
        else
            return a * Math.pow(x,i) * multiply(x,a,i-1);
    }
    public static void main(String[] args) {
        //solution to the summation of x=0.5,a=2 and multiply from i=1 to 20
        System.out.println(multiply(0.5,2,20));

    }
}
