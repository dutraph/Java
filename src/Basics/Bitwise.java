package Basics;

import java.util.Scanner;

public class Bitwise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
         *  &  = "E" bit a bit (V apenas V E V, resto falso)
         *  |  = "OU" bit a bit (F apenas F E F, resto verdadeiro)
         *  ^  = "OU-Exclusivo" (XOR) bit a bit (V apenas se forem exclusivos, F e F = Falso / V e V = Falso)
         * */


        // 0 = false 1 = true
        int n1 = 89; // 0101 1001
        int n2 = 60; // 0011 1100

        System.out.println(n1 & n2); // (24)  = 0001 1000
        System.out.println(n1 | n2); // (125) = 0111 1101
        System.out.println(n1 ^ n2); // (101) = 0110 0101


        // Verificando 6 bit

        int mask = 22;
        System.out.print("Digite o bit que deseja consultar: ");
        int n = sc.nextInt();
        // ou
        // int maskBin = 0b00100000;
        if ((n & mask) != 0){
            System.out.printf("%d bit is 1 = true%n", n);
        } else {
            System.out.printf("%d bit is 0 = false%n", n);
        }
        sc.close();
    }
}