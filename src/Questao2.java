import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=-1,b=-1,c=-1;


        while(a < 0 || a > 40) {
            System.out.print("Digite a quantidade de pilotos:");
            a = sc.nextInt();
        }

        while(b < 0 || b > 1000) {
            System.out.print("Digite a quantidade de voltas a serem analisadas:");
            b = sc.nextInt();
        }

        while(c <= 0 || c > b) {
            System.out.print("Digite a quantidade de voltas inválidas registradas:");
            c = sc.nextInt();
        }

        ArrayList<String> corredores = new ArrayList<>();

        for(int i =0; i < a; i++) {
            System.out.println("oi");
           //
        }

        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(a+b+c);
    }
}
