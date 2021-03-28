package OOP1Intro.Util;

public class CalculatorStatic {
    public static final double PI = 3.14159;

    public static double circumference(double radius){
        return (radius * 2) * 3.14;
    }

    public static double vol(double radius){
        return 4 * (3.14 * Math.pow(radius, 3)) / 3;
    }

}
