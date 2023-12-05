package preparation;

public class Rectangle extends GeometricObject {
    private double length;
    private  double width;
    public Rectangle(double width,double height){
            this.width = width;
            this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }
}
