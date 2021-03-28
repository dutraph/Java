package OOP1Intro.Application;

import OOP1Intro.Util.Ex4Dollar;

import java.util.Scanner;

public class Ex4Prog {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Dollar price today: %.2f%n", Ex4Dollar.DOLLAR_PRICE);
        System.out.print("How many doolars will be bought: ");
        double amount = sc.nextDouble();
        System.out.printf("Amount to be paid in BRL: %.2f%n", Ex4Dollar.calcCurrency(amount));

        sc.close();

    }
}
