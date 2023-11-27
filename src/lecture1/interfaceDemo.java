package lecture1;

public class interfaceDemo{
    public static void main(String[] args) {
        InterfaceFunctional f1 = (a,b)->a+b;
        System.out.println(f1.add(3.5,0.1));
    }
}
