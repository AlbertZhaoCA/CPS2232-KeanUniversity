package lecture2;

public class MyQueueException extends Exception{
    String errMsg;

    //constructor
    public MyQueueException(String errMsg){
        this.errMsg = errMsg;
    }

    //toString print the errMsg
    @Override
    public String toString() {
        return (errMsg);
    }
}
