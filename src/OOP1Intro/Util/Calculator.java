package OOP1Intro.Util;

public class Calculator {

    public final double PI = 3.14159;

    public double circunference(double radius){
        return (radius * 2) * 3.14;
    }

    public double volume(double radius){
        return 4 * (3.14 * Math.pow(radius, 3)) / 3;
    }

}
