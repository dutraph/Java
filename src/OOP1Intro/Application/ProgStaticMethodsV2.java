package OOP1Intro.Application;

import OOP1Intro.Util.Calculator;

import java.util.Scanner;

public class ProgStaticMethodsV2 {
    public static void main(String[] args) {


        //Version 2
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double c = calc.circunference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circunference  = %.2f%n", c);
        System.out.printf("Volume  = %.2f%n", v);
        System.out.printf("PI Value  = %.2f%n", calc.PI);


        sc.close();
    }
}