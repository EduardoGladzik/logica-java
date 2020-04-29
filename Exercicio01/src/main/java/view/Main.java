package view;
import model.Valores;

import java.util.Scanner;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Valores valores = new Valores();

        System.out.println("\f");

        System.out.println("Digite o valor de X1");
        valores.setValorX1(scanner.nextDouble());
        System.out.println("Digite o valor de Y1");
        valores.setValorY1(scanner.nextDouble());
        System.out.println("Digite o valor de X2");
        valores.setValorX2(scanner.nextDouble());
        System.out.println("Digite o valor de Y2");
        valores.setValorY2(scanner.nextDouble());

        System.out.println(valores.calcularDistanciaEntreDoisPontosNoPlanoCartesiano());;
        System.out.println(valores.calcularDistanciaEnreOsPontosY2eX2());
        System.out.println(valores.calcularDistanciaEntreOsPontosX1eY1());
    }
}
