package OOP3Arrays.Application;

import OOP3Arrays.Entites.VectEx1;

import java.util.Scanner;

public class ProgVectEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VectEx1[] vect = new VectEx1[10];


        System.out.print("How Many rooms will be rented: ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new VectEx1(name, email);


        }
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null){
                System.out.printf("Room %d: %s, %s%n", i, vect[i].getName(), vect[i].getEmail());
            }
        }

    }
}
