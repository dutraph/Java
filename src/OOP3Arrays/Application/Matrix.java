package OOP3Arrays.Application;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Matrix range: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) { //mat[i].length = tamanho das colunas
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        int count = 0;
        for (int[] ints : mat) { //enhanced for para linhas
            for (int anInt : ints) { //enhanced for para colunas
                if (anInt < 0) {
                    count++;
                }

            }
        }
        System.out.print("Negative numbers = " + count);


        sc.close();
    }

}


