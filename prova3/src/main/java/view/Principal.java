package view;
import java.util.Scanner;
import model.Nadador;

/**
 * @author Eduardo Gladzik, Christopher e Luís
 *  * @verison 1.0
 *  * @since 09/04/2020 14:24
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Nadador nadador = new Nadador();

        System.out.println("Bem vindo(a) ao sistema!");
        System.out.println("Digite seu nome");
        nadador.setNome(scanner.next());
        System.out.println("Digite sua idade");
        nadador.setIdade(scanner.nextInt());
        System.out.println(nadador.getNome() + " você está na categoria " + nadador.verificarCategoria());
    }
}
