package OOP.Entities;

public class Ex2Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public Ex2Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary(){
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percent){
        this.grossSalary = this.grossSalary + (this.grossSalary * (percent / 100));
    }

    @Override
    public String toString() {
        return this.name + ", " +
                "$" + String.format("%.2f", this.netSalary());
    }
}
