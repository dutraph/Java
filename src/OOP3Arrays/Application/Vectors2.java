package OOP3Arrays.Application;

import OOP3Arrays.Entites.ProductsVect;

import java.util.Scanner;

public class Vectors2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        ProductsVect prod = new ProductsVect();
        ProductsVect[] vect = new ProductsVect[n];

        double avg = 0;
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Prod name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            vect[i] = new ProductsVect(name, price);
            sum += vect[i].getPrice();

        }

        avg = prod.calcAvg(sum, n);
        System.out.printf("Avg price: %.2f", avg);
    }


}
