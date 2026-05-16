package prova_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class figurinhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0, y=0, z=0, w=0;

        ArrayList<Integer> album = new ArrayList<>();

        while (sc.hasNextInt()) {
            if(sc.nextInt() > n || sc.nextInt() < n) {
                System.out.println("ERRO");
            } else {
                if(sc.nextInt()%10==3) {
                    if (!(album.contains(sc.nextInt()))) {
                        y++;
                    } else {
                        w++;
                    }
                } else {
                    if (!(album.contains(sc.nextInt()))) {
                        x++;
                    } else {
                        z++;
                    }
                }

            }

        }

        System.out.println(x + " " + y +" "+z + " "+ w);


    }
}
