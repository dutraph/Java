package Basics;

import java.util.Scanner;
import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        showResult(max(x, y, z));
        sc.close();

    }

    // Criar funçoes fora da main
    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Maior Valor é: " + value);
    }
}
