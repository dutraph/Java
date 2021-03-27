package OOP.Application;

import OOP.Entities.Ex2Employee;

import java.util.Scanner;

public class Ex2Prog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ex2Employee emp1;

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();
        double tax = sc.nextDouble();
        emp1 = new Ex2Employee(name, grossSalary,tax);
        emp1.netSalary();
        System.out.print("Employee: " + emp1);

        System.out.println("");
        System.out.print("Which percetage to increase salary: ");
        double percent = sc.nextDouble();
        emp1.increaseSalary(percent);
        System.out.print("Updated data: " + emp1);
    }
}
