package prova_2022;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        HashMap<String, Integer> lista = new HashMap<>();
        HashMap<String, Integer> listanova = new HashMap<>();



        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        lista.put("A", a);
        lista.put("B", b);
        lista.put("C", c);

        String valorMaiorAlto = lista.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        listanova.put(valorMaiorAlto, lista.get(valorMaiorAlto));

        lista.remove(valorMaiorAlto);

        String valorMedio = lista.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        listanova.put(valorMedio, lista.get(valorMedio));
        lista.remove(valorMedio);

        String menor = lista.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        listanova.put(menor, lista.get(menor));



        if ((listanova.get(valorMaiorAlto)+listanova.get(valorMedio)+listanova.get(menor)) % x == 0) {
            System.out.println("ABC");
            System.out.println(a+b+c);
        } else if ((listanova.get(valorMaiorAlto) + listanova.get(valorMedio)) % x == 0 ) {
            String texto = valorMaiorAlto + valorMedio;
            char[] caracteres = texto.toCharArray();
            Arrays.sort(caracteres);
            String textoOrdenado = new String(caracteres);
            System.out.println(textoOrdenado);
            System.out.println(listanova.get(valorMaiorAlto) + listanova.get(valorMedio));
        }
        else if ((listanova.get(valorMaiorAlto) + listanova.get(menor)) % x == 0 ) {
            String texto = valorMaiorAlto + menor;
            char[] caracteres = texto.toCharArray();
            Arrays.sort(caracteres);
            String textoOrdenado = new String(caracteres);
            System.out.println(textoOrdenado);
            System.out.println(listanova.get(valorMaiorAlto) + listanova.get(menor));
        } else if ((listanova.get(menor) + listanova.get(valorMedio)) % x == 0 ) {
            String texto = valorMedio + menor;
            char[] caracteres = texto.toCharArray();
            Arrays.sort(caracteres);
            String textoOrdenado = new String(caracteres);
            System.out.println(textoOrdenado);
            System.out.println(listanova.get(menor) + listanova.get(valorMedio));
        }

        else if (listanova.get(valorMaiorAlto) % x == 0 ) {
            System.out.println(valorMaiorAlto);
            System.out.println(listanova.get(valorMaiorAlto));
        }

        else if (listanova.get(valorMedio) % x == 0 ) {
            System.out.println(valorMedio);
            System.out.println(listanova.get(valorMedio) );
        }
        else if ( listanova.get(menor) % x == 0 ) {
            System.out.println(menor);
            System.out.println(listanova.get(menor));
        } else{
            System.out.println("NENHUMA");
            System.out.println(0);
        }

    }
}
