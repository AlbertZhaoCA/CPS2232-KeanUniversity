package lambda;

public class interfaceDemo{
    public static void main(String[] args) {
        InterfaceFunctional f1 = (a, b)->a+b;
        System.out.println(f1.add(3.5,0.1));
        display((a,b)->a+b);
    }

    public static void display(InterfaceFunctional f){
        System.out.println(f.add(2.5,3.5));
    }
}
