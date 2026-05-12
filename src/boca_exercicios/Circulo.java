
package boca_exercicios;

import java.util.Scanner;

class No {
    int valor;
    No prox;
    No ant;

    public No(int valor){
        this.valor = valor;
        this.ant = null;
        this.prox = null;
    }
}






public class Circulo {

    static No inicio = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 1; i <= n ; i++) {
            inserir(i);

        }



        int x = sc.nextInt();
        int contagem = 1;

        boolean morto = false;
        int numMorto = 0;

        while (inicio.prox != inicio) {

            inicio = inicio.prox;
            inicio.ant.prox = inicio.prox;
            inicio.prox.ant = inicio.ant;
            if(x == contagem && !morto ) {
                numMorto = inicio.valor;
                morto = true;
            }
            contagem ++;
            inicio = inicio.prox;





        }
        System.out.println("Morte "+x+": "+ numMorto);

        System.out.println("Sobrevivente: " + inicio.valor);




    }


    static void inserir(int x) {
        No novo = new No(x);
        if (inicio == null) {
            inicio = novo;
            inicio.prox = novo;
            inicio.ant = novo;
        } else {
            novo.prox = inicio;
            novo.ant = inicio.ant;
            inicio.ant.prox = novo;
            inicio.ant = novo;

        }
    }

    static void exibir(){
        if (inicio == null){
            System.out.println("vazio");
        } else {
            No temp = inicio;

            System.out.print(temp.valor);
            temp = temp.prox;

            while (temp != inicio) {
                System.out.print(temp.valor);
                temp = temp.prox;

            }
        }
    }
}