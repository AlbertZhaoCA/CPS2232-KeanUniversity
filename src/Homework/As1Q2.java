package homework;
//the use of a generic type (T)
public class As1Q2<T> {

    public static <T extends Number> double mul(T x, T y){
        return  x.doubleValue() * y.doubleValue();//the product of two number
    }

    public static void main(String[] args) {
        System.out.println(mul(5.5,7.5));
    }
}
