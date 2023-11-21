package lecture;
/*
*Qinjian Zhao
*
* **/
public class CharDefaultTest {
    char aChar;

    public static void main(String[] args) {
        CharDefaultTest t;
        t = new CharDefaultTest();
        char c = '\u0000';
        System.out.println(t.aChar);
        System.out.println(c);
        System.out.println(t.aChar==c);
        System.out.println(0==c);//0 is equivalent to \u0000
        System.out.println(t.toString());
    }//end of the main method
}
