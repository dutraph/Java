package OOP4Enum.Application;

import OOP4Enum.Entities.DepartmentComposition;
import OOP4Enum.Entities.Enums.WorkerLevelComposition;
import OOP4Enum.Entities.HourContractComposition;
import OOP4Enum.Entities.WorkerComposition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class ProgComposition {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        WorkerComposition worker;

        System.out.print("Enter department's name: ");
        String dpt = sc.nextLine();

        System.out.println("Enter Worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        worker = new WorkerComposition(name, WorkerLevelComposition.valueOf(level), baseSalary, new DepartmentComposition(dpt));

        System.out.print("How many contracts for this worker: ");
        int numContract = sc.nextInt();
        for (int i = 1; i <= numContract; i++) {
            System.out.printf("Enter contract #%d data: ", i);
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            Date date = sdf.parse(sc.nextLine()); //Parse string to Date
            System.out.print("Value/hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hrs): ");
            int hours = sc.nextInt();
            HourContractComposition contract = new HourContractComposition(date, valuePerHour, hours);
            worker.addContract(contract);

        }

        System.out.print("Enter year and month to calculate income: ");
        sc.nextLine();
        String monthYear = sc.nextLine();
        int month = Integer.parseInt(monthYear.substring(0, 2));
        int year = Integer.parseInt(monthYear.substring(3));


        System.out.println(worker);
        System.out.println("Income for " + monthYear + ": " + worker.income(year, month));

    }
}
