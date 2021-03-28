package OOP2.Application;

import OOP2.Entities.AccountEx1;

import java.util.Scanner;

public class ProgEx1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AccountEx1 ac1;
        System.out.print("Enter Account Number: ");
        int account = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account holder: ");
        String name = sc.nextLine();
        System.out.print("Initial deposity (y/n): ");
        char deposit = sc.next().charAt(0);
        if (deposit == 'y' ){
            System.out.print("Enter initial deposit amount: ");
            double balance = sc.nextDouble();
            ac1 = new AccountEx1(name, account, balance);
        } else {
            ac1 = new AccountEx1(name, account);
        }

        System.out.println("Account data: ");
        System.out.println(ac1);

        System.out.println("Enter a deposit amount: ");
        ac1.deposit(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(ac1);

        System.out.println("Enter a withdraw amount: ");
        ac1.withdraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(ac1);

        sc.close();

    }
}
