

import java.util.Scanner;

public class criptografia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        x = (x-1) + (x+1);
        y = (y-1) + (y+1);

        String hexX = (Integer.toHexString(x)).toUpperCase();
        String hexY = (Integer.toHexString(y)).toUpperCase();

        System.out.println("X = " + hexX);
        System.out.println("Y = " + hexY);
    }
}
