package view;

import model.Aluno;
import java.util.Scanner;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno");
        aluno.setNome(scanner.next());
        System.out.println("Digite a primeira nota");
        aluno.notas[0] = scanner.nextDouble();
        System.out.println("Digite a segunda nota");
        aluno.notas[1] = scanner.nextDouble();
        System.out.println("Digite a terceira nota");
        aluno.notas[2] = scanner.nextDouble();

        System.out.println("Conceito: " + aluno.verificarConceito());
        System.out.println(aluno.calcularMediaAritimetica() >= 7 ? "Aprovado" : "reprovado");
    }
}
