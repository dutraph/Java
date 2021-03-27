package Basics;

import java.util.*;
import java.lang.Math;
public class ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Ex 1 - Impares

//		System.out.print("Enter a number to discover the even numbers: ");
//		int x = sc.nextInt();
//		for (int i = 0; i <= x; i++) {
//			if (!(i % 2 == 0)) {
//				System.out.println(i);
//			}
//		}
//
        // Ex 2
//		System.out.print("Enter the range number: ");
//		int y = sc.nextInt();
//		int num;
//		int qtyIn = 0;
//		int qtyOut = 0;
//		for (int i = 1; i <= y; i++) {
//			num = sc.nextInt();
//			if (num >= 10 && num <= 20) {
//				qtyIn++;
//			} else {
//				qtyOut++;
//			}
//		}
//		System.out.printf("%d in%n", qtyIn);
//		System.out.printf("%d out%n", qtyOut);

        // Ex 3
//        System.out.print("Enter the range number: ");
//        int a = sc.nextInt();
//        double n1 = 0.0, n2 = 0.0, n3 = 0.0;
//        double medPond;
//        for (int i = 1; i <= a; i++) {
//            n1 = sc.nextDouble();
//            n2 = sc.nextDouble();
//            n3 = sc.nextDouble();
//            medPond = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
//            System.out.printf("%.1f%n", medPond);
//
//        }

        // Ex 4

//        System.out.print("Enter the range number: ");
//        int rang = sc.nextInt();
//        double n1 = 0.0, n2 = 0.0;
//        String resp;
//        double div;
//        for (int i = 1; i <= rang; i++) {
//            n1 = sc.nextInt();
//            n2 = sc.nextInt();
//            if (n2 == 0) {
//                resp = "Divisao impossivel";
//                System.out.println(resp);
//            } else {
//                div = (n1 / n2);
//                System.out.println(div);
//            }
//        }

        // Ex 5

//        int fat = 1;
//        int n = 5;
//        for (int i = 1; i <= n; i++){
//            fat = fat * i;
//        }
//        System.out.println(fat);

        // Ex 6
//        int n = 12;
//        for (int i = 1 ; i <= n; i++){
//            if (n % i == 0){
//                System.out.println(i);
//            }
//        }

        // Ex 7
        int n = 5;
        for (int i = 1 ; i <= n; i++){
            System.out.printf("%d %.0f %.0f%n", i, Math.pow(i,2.0), Math.pow(i,3.0));
        }

    }

}
