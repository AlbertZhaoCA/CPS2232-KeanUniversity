package lecture1;

public class BoundedTypeDemo {
    public static void main(String[] args) {
        lecture1.Rectangle rectangle = new lecture1.Rectangle(2,2);
        Circle circle = new Circle(2);
        System.out.println("Same area? " + equalArea(rectangle,circle));
    }

    public static <E extends GeometricObject> boolean equalArea(E object1,E object2){
        return object1.getArea()==object2.getArea();
    }
}

