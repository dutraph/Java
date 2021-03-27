package Basics;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c;
        char exit;
        String msg;

        do {
            System.out.print("Enter a Celcius value to converto to Fahrenheit: ");
            c = sc.nextDouble();
            double f = (9*c) / 5 + 32;
            System.out.printf("%.1fC = %.1fF%n", c, f);
            System.out.print("Exit? [y/n] ");
            exit = sc.next().charAt(0);
            msg = exit == 'y'? "Bye": "Here we go again...";
            System.out.println(msg);
        }
        while ((exit == 'n'));
    }
}
