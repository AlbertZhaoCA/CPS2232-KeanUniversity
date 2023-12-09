package generics;

import preparation.Circle;
import preparation.GeometricObject;
import preparation.Rectangle;

public class BoundedTypeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new preparation.Rectangle(2,2);
        Circle circle = new Circle(2);
        System.out.println("Same area? " + equalArea(rectangle,circle));
    }

    public static <E extends GeometricObject> boolean equalArea(E object1, E object2){
        return object1.getArea()==object2.getArea();
        /*  why do you need to define getArea() in GeometricObject?
        /   using the getArea method in your generic method equalArea, and the compiler needs to ensure that any type E
        /   that is used with this method has the required method. Compiler does not know what type E in compile time,
        If a generic type is bounded, the compiler replaces it with the bounded type. For example, the compiler would
        convert the following method in (a) into (b).
        */
    }
}

