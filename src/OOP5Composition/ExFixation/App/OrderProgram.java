package OOP5Composition.ExFixation.App;

import OOP5Composition.ExFixation.Entities.Client;
import OOP5Composition.ExFixation.Entities.Enums.OrderStatus;
import OOP5Composition.ExFixation.Entities.Order;
import OOP5Composition.ExFixation.Entities.OrderItem;
import OOP5Composition.ExFixation.Entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OrderProgram {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Client c1;
        OrderItem items;
        Product prod;
        Order order;
        System.out.println("Enter the Client Data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date: ");
        Date birthDate = sdf.parse(sc.nextLine());
        System.out.print("Order Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        c1 = new Client(name, email, birthDate);
        order = new Order(new Date(), status, c1);


        System.out.print("How many items to this order: ");
        int numberOfItems = sc.nextInt();
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.println("Enter #"+ i + " item data:");
            System.out.print("Product Name: ");
            sc.nextLine();
            String prodName = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            items = new OrderItem(qty, price, new Product(prodName, price));
            order.addItem(items);
        }

        System.out.println(order);
    }
}
