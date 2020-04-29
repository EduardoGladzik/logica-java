import java.lang.reflect.Array;

public class Principal {
    //psvm + tecla TAB
    public static void main(String[] args) {

        //sout + tecla TAB
//        System.out.println("oi....");

//        String[] nomes = new String[3];
//        nomes[0] = "joao";
//        nomes[1] = "pedro";
//        nomes[2] = "ze";
//
//        foreach
//        for(String nome : nomes) {
//            System.out.println(nome);
//        }

//        String[] nomess = {"a", "b", "b", "b", "a"};
//
//        for(String nome : nomess) {
//            System.out.println(nome);
//        }
//
//        Array.set(nomess, 1, "c");
//
//        for(String nome : nomess) {
//            System.out.println(nome);
//        }

//        System.out.println("primeiro nome: " + nomes[0]);



//        int numero = 10;
//        System.out.println(numero);

        //vetor... vector... array - variável unidimensional
//        int[] numeros = new int[3]; //numero de posicoes
//        numeros[0] = 100;
//        numeros[1] = 200;
//        numeros[2] = 300;
//        System.out.println(numeros[2]);
//
//        for(int indice = 0 ; indice < numeros.length ; indice++) {
//            System.out.println(numeros[indice]);
//        }



        //matriz
        int[][] numeros = new int[3][3];

        int valores = 1;
        for(int linha = 0 ; linha < 3 ; linha++) {
            for(int coluna = 0 ; coluna < 3 ; coluna++) {
                numeros[linha][coluna] = valores;
                valores++;
            }
        }

        for(int linha = 0 ; linha < 3 ; linha++) {
            for(int coluna = 0 ; coluna < 3 ; coluna++) {
                System.out.print(" " + numeros[linha][coluna] + " ");
            }
            System.out.println("\n");
        }

//         c
//l        1  2  3
//         4  5  6
//         7  8  9

    }
}