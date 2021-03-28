package OOP3Arrays.Application;

import java.util.Scanner;

public class Vectors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of positions for your vect: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        double avg = 0;
        double sum=0;
        for (int i = 0; i<n; i++){
            System.out.printf("Enter the %d value: ",i + 1);
            vect[i] = sc.nextDouble();
            sum += vect[i];
            avg = sum/n;
        }
        System.out.printf("Avg height: %.2f", avg);

        sc.close();
    }
}
