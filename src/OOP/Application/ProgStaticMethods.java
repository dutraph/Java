package OOP.Application;

import java.util.Scanner;

public class ProgStaticMethods {

    // Const , We use uppercase in constant declaration;
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        //Version 1
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double c = circunference(radius);
        double v = volume(radius);

        System.out.printf("Circunference  = %.2f%n", c);
        System.out.printf("Volume  = %.2f%n", v);
        System.out.printf("PI Value  = %.2f%n", Math.PI);


        sc.close();
    }
    // Static Methods

    public static double circunference(double radius){
        return (radius * 2) * 3.14;
    }

    public static double volume(double radius){
        return 4 * (3.14 * Math.pow(radius, 3)) / 3;
    }


}


