package OOP6Inheritance_Polymorphism.INHERITANCE.APP;

import OOP6Inheritance_Polymorphism.INHERITANCE.ENTITIES.Account;
import OOP6Inheritance_Polymorphism.INHERITANCE.ENTITIES.BusinessAccount;
import OOP6Inheritance_Polymorphism.INHERITANCE.ENTITIES.SavingsAccount;

public class ProgramInheritance {
    public static void main(String[] args) {


        Account acc = new Account(1001, "Paulo", 0.0);
        BusinessAccount bacc = new BusinessAccount(2001, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(2001,"Jack", 3000.0, 550.0);
        Account acc3 = new SavingsAccount(4001,"Paulo", 4030.0,10.0);

        // DOWNCASTING

        BusinessAccount bacc1 = (BusinessAccount) acc2;

        if (acc3 instanceof  BusinessAccount){
            BusinessAccount acc4 = (BusinessAccount) acc3;
            acc4.loan(400.00);
            System.out.println("Loan");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.setInterestRate(40.0);
            acc5.updateBalance();
            System.out.println("Update");

        }

        Account a1 = new Account(101,"Joanne", 1000.0);
        a1.withdraw(200);
        System.out.println(a1.getBalance());

        Account b1 = new BusinessAccount(202, "Peter", 1000.0,500.0);
        b1.withdraw(200);
        System.out.println(b1.getBalance());

        Account s1 = new SavingsAccount(303, "Paul", 1000.0, 0.01);
        s1.withdraw(200);
        System.out.println(s1.getBalance());
    }

}
