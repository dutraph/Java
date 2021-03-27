package OOP.Application;

import OOP.Entities.Ex1Rectang;

import java.util.Scanner;

public class Ex1Prog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ex1Rectang r1;
        System.out.println("Enter rectangle width and height: ");

        double width = sc.nextDouble();
        sc.nextLine();
        double height = sc.nextDouble();

        r1 = new Ex1Rectang(width,height);
        System.out.println(r1);


        sc.close();

    }
}
