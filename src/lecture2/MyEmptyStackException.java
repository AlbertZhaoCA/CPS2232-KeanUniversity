package lecture2;

public class MyEmptyStackException extends Exception {
    String erroMsg;

    public MyEmptyStackException(String error){
        erroMsg = error;
    }

    @Override
    public String toString() {
        return ("Customized Exception Object : " + erroMsg );
        //you cannot pop something from noting
    }
}
