

import java.util.ArrayList;
import java.util.Scanner;

public class bussola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n = n % 359;

        if (n == 0) {
            n = 1;
        }

        int a = -1;

        ArrayList<Integer> lista = new ArrayList<>();

        while(a != 0) {
            a = sc.nextInt();
            lista.add(a);
        }


        while(lista.contains(n)) {

            n += 5;
            if (n>= 360) {
                n -= 359;
            }
        }



        System.out.println(n);


    }
}
