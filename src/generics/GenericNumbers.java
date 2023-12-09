package generics;

public class GenericNumbers <E,T> {
    private E firstNumber;
    private T secondNumber;

    public GenericNumbers(E firstNumber,T secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public<T> E getFirstNumber(T t) {
        return firstNumber;
    }

    public  T getSecondNumber() {
        return secondNumber;
    }

    public void display(){
        System.out.println("First number is = "+firstNumber+"\n"+"second number is = " +secondNumber);
    }

    public static void main(String[] args) {
        GenericNumbers<Integer,Double> num = new GenericNumbers<>(4,9.5);
        System.out.println(num.getFirstNumber("34"));// The T t is different with class generics <E,T>
        num.display();
    }
}
