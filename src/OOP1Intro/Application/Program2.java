package OOP1Intro.Application;

import OOP1Intro.Entities.Product;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product p1;

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Quantity: ");
        int qty = sc.nextInt();
        sc.nextLine();
        p1 = new Product(name,price,qty);
        System.out.println("Product data: " + p1);

        System.out.print("Enter the quantity of products to be add in stock: ");
        p1.addProducts(sc.nextInt());
        System.out.println("Updated data: " + p1);

        System.out.print("Enter the quantity of products to be removed from stock: ");
        p1.removeProducts(sc.nextInt());
        System.out.println("Updated data: "+ p1);


        sc.close();
    }
}
