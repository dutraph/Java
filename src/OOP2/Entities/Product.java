package OOP2.Entities;

public class Product {

    private String name;
    private double price;
    private int qty;

    // Default constructor
    public Product(String name) {
    }

    // Constructor without qty
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    // Full constructor
    public Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    // Methods
    public double totalValueInStock() {
        return this.qty * this.price;
    }

    public void addProducts(int quantity) {
        this.qty += quantity;
    }

    public void removeProducts(int quantity) {
        this.qty -= quantity;

    }

    @Override
    public String toString() {
        return name + ", " +
                "$" + String.format("%.2f", price) + ", " +
                qty + " units, " +
                "$" + String.format("%.2f", this.totalValueInStock());
    }
}

