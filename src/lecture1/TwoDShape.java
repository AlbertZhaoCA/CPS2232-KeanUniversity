package lecture1;

public class TwoDShape {
    private double len;
    private double wid;

    public TwoDShape(double l,double w){
        len = l;
        wid = w;
    }

    public double getLen() {
        return len;
    }

    public double getWid() {
        return wid;
    }

    public double area() {
        return len*wid;
    }

    public String toString(){
        return "Length is "+len + "cm" + " \n Width is " + wid +"cm ";
    }
}
