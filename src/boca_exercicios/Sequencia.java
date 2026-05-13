package boca_exercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Sequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();


        HashMap<Integer, Integer> s = new HashMap<>();

        int sn = 0;
        for(int i = 1; i <= n; i++) {
            sn = sc.nextInt();
            if(!(s.containsKey(sn))) {
                s.put(sn, 1);
            } else {
                s.put(sn, s.get(sn) + 1);
            }
        }

        if (k%n == 0) {
            int valorAbsoluto = k/n;
            int count = 1;
            while (count <= s.size()){
                if(s.get(1) == valorAbsoluto) {

                }
            }
        }



        System.out.println(s.toString());


    }
}
