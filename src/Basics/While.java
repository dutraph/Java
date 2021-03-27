package Basics;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

//		int b = 10;
//		int k = 0;
//		int sum = 0;
//		while (k <= b) {
//			System.out.println(k);
//			sum += k;
//			k++;
//		}
//		System.out.println(sum);
//
//		System.out.println("---------------");
//		System.out.println("---------------");
//		for (int i = 1; i <= b; i++) {
//			System.out.printf("%nTabuada de %d%n", i);
//			for (int a = 0; a <= b; a++) {
//				System.out.printf("%d x %d = %d%n", i, a, (i * a));
//
//			}
//		}

        // Exercicios
        Scanner sc = new Scanner(System.in);
        int x, y;
        String quadrante;
        while (true) {
            System.out.println("Enter X and Y");
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 || y == 0) {

            } else {

                if (x > 0 && y > 0) {
                    quadrante = "Primeiro";
                } else if (x < 0 && y > 0) {
                    quadrante = "Segundo";
                } else if (x < 0 && y < 0) {
                    quadrante = "Terceiro";
                } else {
                    quadrante = "Quarto";
                }

                System.out.println(quadrante);
            }
        }

    }
}
