package OOP.Entities;

public class Ex1Rectang {

    public double width;
    public double height;

    public Ex1Rectang(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(){
        return this.height * this.width;
    }

    public double perimeter(){
        return 2 * (this.height + this.width);
    }

    public double diagonal(){
        return Math.sqrt((Math.pow(this.height,2) + (Math.pow(this.width, 2))));
    }

    @Override
    public String toString() {
        return " AREA: " + String.format("%.2f%n", this.area()) +
               " PERIMETER: " + String.format("%.2f%n", this.perimeter()) +
               " DIAGONAL: " + String.format("%.2f", this.diagonal());
    }
}

