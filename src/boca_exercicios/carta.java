
import java.util.Scanner;

public class carta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     String entrada = sc.next();

        int l = entrada.length();

        int nmatriz = 0;
        for(int i = 1; i <= 8 ; i++) {
            if(i*i == l){
                nmatriz = i;
                break;
            }
        }

        String palavra = "";

        if(nmatriz == 0) {
            System.out.print("invalido");
        } else {
            for (int b = 0; b < (nmatriz*nmatriz); b+=(nmatriz)) {
                palavra += entrada.charAt(b);
                b++;
            }
        }

        System.out.println(palavra);


        }






    }

