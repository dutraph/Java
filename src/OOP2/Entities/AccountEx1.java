package OOP2.Entities;

public class AccountEx1 {

    private String name;
    private int number;
    private double balance;

    public AccountEx1() {
    }

    public AccountEx1(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public AccountEx1(String name, int number, double initialDeposit) {
        this.name = name;
        this.number = number;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.00;
    }

    @Override
    public String toString() {
        return "Account: " + getNumber() +
                ", Holder: " + getName() +
                ", Balance: " + getBalance();
    }
}
