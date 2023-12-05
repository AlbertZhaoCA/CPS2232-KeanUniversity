package generics;

import preparation.Circle;
import preparation.GeometricObject;

public class BoundedTypeDemo {
    public static void main(String[] args) {
        preparation.Rectangle rectangle = new preparation.Rectangle(2,2);
        Circle circle = new Circle(2);
        System.out.println("Same area? " + equalArea(rectangle,circle));
    }

    public static <E extends GeometricObject> boolean equalArea(E object1, E object2){
        return object1.getArea()==object2.getArea();
    }
}

