package OOP5Composition.ExFixation.Entities;


import OOP5Composition.ExFixation.Entities.Enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }

    public Double total(){
        double sumTotal = 0.0;
        for (OrderItem i: orderItems) {
            sumTotal += i.subTotal();
        }
        return sumTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment: ").append(sdf.format(moment)).append("\n");
        sb.append("Order Status: ").append(getStatus()).append("\n");
        sb.append("Client: ").append(getClient()).append("\n");
        sb.append("Order Items: \n");
        double sumItemPrice = 0.0;
        for (OrderItem i: orderItems) {
            sb.append(i);
        }
        sb.append("Total to pay: \n$").append(total());
        return sb.toString();
    }
}
