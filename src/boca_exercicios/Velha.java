
import java.util.Scanner;


public class Velha
{

    public static void main(String[] args) {
        String entrada = "";
        Scanner sc = new Scanner(System.in);

        char[] l1 = new char[3];
        char[] l2 = new char[3];
        char[] l3 = new char[3];


        entrada = sc.next();

        l1[0] = entrada.charAt(0);
        l1[1] = entrada.charAt(1);
        l1[2] = entrada.charAt(2);


        entrada = sc.next();

        l2[0] = entrada.charAt(0);
        l2[1] = entrada.charAt(1);
        l2[2] = entrada.charAt(2);


        entrada = sc.next();

        l3[0] = entrada.charAt(0);
        l3[1] = entrada.charAt(1);
        l3[2] = entrada.charAt(2);

        if(l1[0] == 'X' && l2[0] == 'X' && l3[0] == 'X'){
            System.out.println("X venceu!");
        } else if (l1[1] == 'X' && l2[1] == 'X' && l3[1] == 'X') {
            System.out.println("X venceu!");
        } else if (l1[2] == 'X' && l2[2] == 'X' && l3[2] == 'X') {
            System.out.println("X venceu!");
        } else if (l1[0] == 'X' && l1[1] == 'X' && l1[2] == 'X') {
            System.out.println("X venceu!");
        } else if (l2[0] == 'X' && l2[1] == 'X' && l2[2] == 'X') {
            System.out.println("X venceu!");
        } else if (l3[0] == 'X' && l3[1] == 'X' && l3[2] == 'X') {
            System.out.println("X venceu!");
        } else if (l1[0] == 'X' && l2[1] == 'X' && l3[2] == 'X') {
            System.out.println("X venceu!");
        } else if (l1[2] == 'X' && l2[1] == 'X' && l3[0] == 'X') {
            System.out.println("X venceu!");
        }
        else if (l1[0] == 'O' && l2[0] == 'O' && l3[0] == 'O') {
            System.out.println("O venceu!");
        } else if (l1[1] == 'O' && l2[1] == 'O' && l3[1] == 'O') {
            System.out.println("O venceu!");
        } else if (l1[2] == 'O' && l2[2] == 'O' && l3[2] == 'O') {
            System.out.println("O venceu!");
        } else if (l1[0] == 'O' && l1[1] == 'O' && l1[2] == 'O') {
            System.out.println("O venceu!");
        } else if (l2[0] == 'O' && l2[1] == 'O' && l2[2] == 'O') {
            System.out.println("O venceu!");
        } else if (l3[0] == 'O' && l3[1] == 'O' && l3[2] == 'O') {
            System.out.println("O venceu!");
        } else if (l1[0] == 'O' && l2[1] == 'O' && l3[2] == 'O') {
            System.out.println("O venceu!");
        } else if (l1[2] == 'O' && l2[1] == 'O' && l3[0] == 'O') {
            System.out.println("O venceu!");
        } else if (l1[0] == '#' || l1[1] == '#' || l1[2] == '#' ||
                l2[0] == '#' || l2[1] == '#' || l2[2] == '#' ||
                l3[0] == '#' || l3[1] == '#' || l3[2] == '#') {
            System.out.println("Jogo em andamento");
        } else {
            System.out.println("Velha");
        }
    }







}


