package OOP1Intro.Util;

public class Ex4Dollar {

    public static final double DOLLAR_PRICE = 3.10;

    public static final double IOF_TAX = 0.06;


    public static double calcCurrency(double amount){
        return (amount + (amount * IOF_TAX)) * DOLLAR_PRICE;
    }
}
