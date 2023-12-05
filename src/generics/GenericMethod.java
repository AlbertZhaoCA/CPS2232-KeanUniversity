package generics;

public class GenericMethod {
    public static <T> boolean isEqual(GenericType<T> a, GenericType<T>b){
        return a.getT().equals(b.getT());
    }

    public static void main(String[] args) {
        GenericType<String> a = new GenericType<>();
        a.setT("Kean");
        GenericType<String> b = new GenericType<>();
        b.setT("Ken");
        boolean isEqual = GenericMethod.<String>isEqual(a,b);
        System.out.println(isEqual);
        System.out.println(isEqual = GenericMethod.isEqual(a,b));
    }

}
