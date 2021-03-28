package OOP3Arrays.Application;

import OOP3Arrays.Entites.ListEx2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<ListEx2> list = new ArrayList<>();
        System.out.print("How many employee will be registered");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d%n", i + 1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new ListEx2(id, name, salary));
        }

        System.out.print("Enter the ID that will have the salary increased: ");
        int id = sc.nextInt();
        double percent;
        ListEx2 findId = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (findId == null) {
            System.out.println("This ID doesn't exist.");
        } else {
            System.out.print("Enter the percentage: ");
            percent = sc.nextDouble();
            findId.calcRaise(percent);

        }
        System.out.println("List of Employees:");
        for (ListEx2 i : list) {
            System.out.println(i);
        }


    }


}
