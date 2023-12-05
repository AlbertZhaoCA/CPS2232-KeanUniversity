package preparation;

public class PassByValue {
    public static void main(String[] args) {
        int number = 99;
        System.out.println("Value before method call is " +number);
        changeNum(number);
        System.out.println("Value after method call is " + number);
    }

    public static int changeNum(int myValue){
        myValue += 1;//pass by value
        System.out.println("Pass by value inside method call is " +myValue);
        return myValue;
    }
}
