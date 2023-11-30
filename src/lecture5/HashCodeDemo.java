package lecture5;

public class HashCodeDemo {
    public static void main(String[] args) {
        String hi = "Hi";
        System.out.println("Hashcode of the string Hi = " + hi.hashCode());
        String post = "post";
        System.out.println("Hashcode of the string post = " + post.hashCode());
        System.out.println("Hashcode of the string stop = " + "stop".hashCode());
        System.out.println("Hashcode of the string stop = " + "tops".hashCode());

        System.out.println("Hashcode of the string Hello,World = " + "Hello World".hashCode());
        System.out.println("Hashcode of the string London = " + "London".hashCode());
        
        System.out.println("Hashcode of the string tea = " + "tea".hashCode());
        System.out.println("Hashcode of the string eta = " + "eta".hashCode());

    }
}
