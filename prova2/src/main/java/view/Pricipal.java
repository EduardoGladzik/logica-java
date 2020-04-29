package view;
import java.util.Scanner;
import model.Combustivel;
/**
 * @author Eduardo Gladzik, Christopher e Luís
 * @version 1.0
 * @since 09/04/2020 14:02
 */
public class Pricipal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Combustivel combustivel = new Combustivel();

        System.out.println("Bem vindo ao sistema!");

        int opcao = 0;
        do {
            System.out.println("Digite a quantidade de litros");
            combustivel.setQuantidadeDelitros(scanner.nextDouble());
            System.out.println(combustivel.retoranrMenu());
            opcao = scanner.nextInt();
            System.out.println("Valor total a pagar: " + combustivel.retornarSwitch(opcao));
        } while (opcao != 4);
    }
}
