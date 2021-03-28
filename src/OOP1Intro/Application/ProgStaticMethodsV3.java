package OOP1Intro.Application;

import OOP1Intro.Util.CalculatorStatic;

import java.util.Scanner;

public class ProgStaticMethodsV3 {
    public static void main(String[] args) {


        //Version 3
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double c = CalculatorStatic.circumference(radius);
        double v = CalculatorStatic.vol(radius);

        System.out.printf("Circunference  = %.2f%n", c);
        System.out.printf("Volume  = %.2f%n", v);
        System.out.printf("PI Value  = %.2f%n", CalculatorStatic.PI);


        sc.close();
    }
}
