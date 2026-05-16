package prova_2022;

import java.util.Scanner;
import java.util.Stack;

public class navio {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Stack<Integer> pilhaInvertida = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int x;
        while (true){
            x = sc.nextInt();
            if(x == -1) break;
            if(x == 0) pilha.pop();
            else pilha.add(x);
        }

        while(!pilha.isEmpty()){
            pilhaInvertida.add(pilha.pop());
        }
        while(!pilhaInvertida.isEmpty()){
            System.out.println(pilhaInvertida.pop());        }
     }
}
