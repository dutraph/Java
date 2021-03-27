package Basics;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Type your age: ");
//        int age = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Type your Name: ");
//        String name = sc.nextLine();
//
//        if (!name.equals("Paulo")){
//            System.out.println("Your age, " + age);
//        } else {
//            System.out.println("Bye " + name);
//        }

        // Par ou impar
//        System.out.print("Entre um numero pra saber se é par ou impar: ");
//        int number = sc.nextInt();
//
//        if (number % 2 == 0){
//            System.out.println("Par");
//        }else {
//            System.out.println("Impar");
//        }

        // Multiplos with ternary operator
        System.out.print("Entre um numero pra saber se sao multiplos: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String multiplos = (n1 % n2 == 0 || n2 % n1 == 0) ? "Multiplos" : "nao sao multiplos";
        System.out.println(multiplos);

        sc.close();
    }
}
