package OOP3Arrays.Entites;

public class ProductsVect {

    private String name;
    private Double price;

    public ProductsVect() {
    }

    public ProductsVect(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public double calcAvg(double sum, int n){
        return sum/n;
    }

    @Override
    public String toString() {
        return "ProductsVect{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
