package lecture1;

public class ThreeDShapeInheritence extends TwoDShape{
    public ThreeDShapeInheritence(double l,double w){
        super(l,w);
    }
    private double height;
    public ThreeDShapeInheritence(double l,double w,double h){
        super(l,w);
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public String toString(){
        return super.toString()+"\n Height is: " +height +"cm"+"\n volume is " +area()*height + "cm cube";
    }
}
