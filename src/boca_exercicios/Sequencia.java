package boca_exercicios;

import java.util.Scanner;

public class Sequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();


        int[] vetor = new int[n];

        for (int i = 0; i<n; i++) {
            int numero = sc.nextInt();
            vetor[i] = numero;
        }

        for (int i = 0; i<n; i++) {
            System.out.println(vetor[i]);

        }


    }
}
