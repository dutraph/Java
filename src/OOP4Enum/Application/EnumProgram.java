package OOP4Enum.Application;

import OOP4Enum.Entities.Enums.OrderStatus;
import OOP4Enum.Entities.Order;

import java.util.Date;

public class EnumProgram {

    public static void main(String[] args) {


        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        // Convert from String to Enum
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os = OrderStatus.valueOf("DELIVERED");

    }

}

