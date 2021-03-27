package OOP.Application;

import OOP.Entities.Ex3FinalGrade;

import java.util.Scanner;

public class Ex3Prog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ex3FinalGrade student1;
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter 1st grade: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter 2nd grade: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter 3rd grade: ");
        double n3 = sc.nextDouble();
        student1 = new Ex3FinalGrade(name, n1, n2, n3);

        student1.finalGrade();
        System.out.println(student1);

    }
}
