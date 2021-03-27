package Basics;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = sc.next();
//
//        System.out.println("Welcome " + name);

        // %f - float | %d - int | %s - string | %n - break line

        double x = 3.5765;
        double y = 6.255;
        double z = 9.665;
        System.out.printf("%.2f%n", x);
        System.out.printf("x = %.2f%ny = %.2f%nz = %.2f%n", x, y, z);

        String name = "Paulo";
        int age = 30;
        double height = 1.80;
        System.out.printf("%s is %d years old and %.2fm tall", name, age, height);

        char c = sc.next().charAt(0);
        System.out.println("your char is: " + c);

        sc.close();
    }
}