package OOP.Entities;

public class Product {

    public String name;
    public double price;
    public int qty;

    public Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public double totalValueInStock(){
        return this.qty * this.price;
    }

    public void addProducts(int quantity){
        this.qty += quantity;
    }

    public void removeProducts(int quantity){
        this.qty -= quantity;

    }

    @Override
    public String toString() {
        return  name + ", " +
               "$" + String.format("%.2f", price) + ", " +
                qty + " units, " +
                "$" + String.format("%.2f", this.totalValueInStock());
    }
}

