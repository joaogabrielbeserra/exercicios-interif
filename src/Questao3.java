import java.util.ArrayList;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        int n = -1;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            boolean veri = true;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    veri = false;
                    break;
                }
            }
            if (veri) lista.add(i);
        }
        for (int i = 0; i < lista.size()-1; i++) {
            System.out.print(lista.get(i)+" ");

        }
        System.out.print(lista.get(lista.size()-1));

    }
}



