package Basics;

public class Casting {

    public static void main(String[] args) {

        int x, y;
        double result;

        x = 5;
        y = 2;
        result = (double) x / y; // answer without casting = 2.0(wrong) | answer with casting = 2.5(right)

        System.out.println(result);

    }
}
