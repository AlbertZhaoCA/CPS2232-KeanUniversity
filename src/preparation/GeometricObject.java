package preparation;

public class GeometricObject {
    private String color;
    private boolean filled;
    java.util.Date dateCreated;

    public GeometricObject(){

    }
    public GeometricObject(String color,boolean filled){
        this.color = color;
        this.filled = filled;

    }

    public double getArea() {
        return 0;
    }
}
