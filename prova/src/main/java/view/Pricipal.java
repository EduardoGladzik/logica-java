package view;

import java.util.Scanner;
import model.Mes;

/**
 * @author Eduardo Gladzik, Christopher e Luís
 *  * @version 1.0
 *  * @since 09/04/2020 13:25
 */
public class Pricipal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Mes mes = new Mes();

        System.out.println("Digite seu mês de nascimento");
        mes.setMesDeNascimento(scanner.nextInt());

        System.out.println("Você nasceu no: " + mes.verificarTrimestre());
    }
}
