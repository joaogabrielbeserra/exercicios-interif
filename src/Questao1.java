public class Questao1 {
    public static void main(String[] args) {
        String nomeMonstro = "Liche bondoso bacanA";
        int vogais = 0;

        for (int i = 0; i < nomeMonstro.length(); i++) {
            if (
                    nomeMonstro.toLowerCase().charAt(i) == 'a' ||
                    nomeMonstro.toLowerCase().charAt(i) == 'e' ||
                    nomeMonstro.toLowerCase().charAt(i) == 'i' ||
                    nomeMonstro.toLowerCase().charAt(i) == 'o' ||
                    nomeMonstro.toLowerCase().charAt(i) == 'u'
            ) {
                vogais++;
            }
        }

        vogais = vogais%3;

        switch (vogais) {
            case(0) : {
                System.out.println("frasco 0");
                break;
            }
            case(1) : {
                System.out.println("frasco 1");
                break;
            }
            case(2) : {
                System.out.println("frasco 2");
                break;
            }
        }



    }
}
