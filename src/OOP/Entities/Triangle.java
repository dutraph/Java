package OOP.Entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle() {
    }

    public double calcArea(){
        double p = (a + b + c)/ 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
