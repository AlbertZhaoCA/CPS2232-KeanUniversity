package lecture1;

public class ThreeDShapeInheritanceTest {
    public static void main(String[] args) {
        ThreeDShapeInheritence threeD = new ThreeDShapeInheritence(5.0,3.0,2.0);
        threeD.getLen();
        threeD.getWid();
        threeD.getHeight();
        System.out.println(threeD.toString());

    }
}
