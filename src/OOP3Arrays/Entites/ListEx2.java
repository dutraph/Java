package OOP3Arrays.Entites;

public class ListEx2 {
    private Integer id;
    private String name;
    private Double salary;

    public ListEx2() {
    }

    public ListEx2(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void calcRaise(double percent){
        this.salary += (this.salary * (percent / 100));
    }

    @Override
    public String toString() {
        return "ID " + getId() +
                ", " + getName() +
                ", $" + getSalary();
    }
}
