package OOP1Intro.Application;
import OOP1Intro.Entities.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre os lados do primeiro triangulo: ");
        Triangle x = new Triangle();
        x.a = sc.nextInt();
        x.b = sc.nextInt();
        x.c = sc.nextInt();
        double areaX = x.calcArea();

        System.out.print("Entre os lados do segundo triangulo: ");
        Triangle y = new Triangle();
        y.a = sc.nextInt();
        y.b = sc.nextInt();
        y.c = sc.nextInt();
        double areaY = y.calcArea();

        System.out.printf("Maior area: %.2f%n", Math.max(areaX,areaY));
    }
}
