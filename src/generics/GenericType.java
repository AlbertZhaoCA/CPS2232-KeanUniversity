package generics;

public class GenericType<T> {
    private T t;
    public T getT(){
        return this.t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericType<String> type = new GenericType<>();
        type.setT("Kean");
        System.out.println(type.getT());

        GenericType type1 = new GenericType();
        type1.setT("Ken");
        System.out.println(type1.getT());
        type1.setT(10);
        System.out.println(type1.getT());
    }
}
