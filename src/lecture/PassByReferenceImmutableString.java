package lecture;
/*
*Qinjian Zhao
*
* **/
public class PassByReferenceImmutableString {
    public static void main(String[] args) {
        String name = "Java";
        System.out.println("String before method call is " +name);
        showImmutable(name);
        System.out.println("String after method call is " +name);
    }

    public static void showImmutable(String name) {
        name = "HTML";//pass by value
        System.out.println("Inside is " +name);

    }
}
