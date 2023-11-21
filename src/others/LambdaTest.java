package others;

public class LambdaTest {
    interface AddMachine{
        void add(int a,int b);
    }

    public static void another(AddMachine a){
        a.add(4,1);
    }

    public static void main(String[] args) {

        another(new AddMachine() {
            @Override
            public void add(int a, int b) {
                System.out.println(a+b);;
            }
        });//yes this one and the next one are equivalent

        another((a,b)->System.out.println(a+b));

    }

}