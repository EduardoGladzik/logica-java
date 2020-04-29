package view;

import DAO.BancoArrayPessoa;
import model.Pessoa;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class Principal {

    public static void main(String[] args) {

        System.out.println("Seja bem vindo ao sistema");

        Scanner scanner = new Scanner(System.in);
        BancoArrayPessoa agenda = new BancoArrayPessoa();
        int opcao = 0;
        Pessoa pessoa = null;

        do {
            System.out.println("1-cadastrar\n2-ver agenda\n3-deletar\n4-filtrar\n5-ver qtd\n6-esvaziar agenda\n100-Sair");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    pessoa = new Pessoa();
                    System.out.println("Digite o seu nome");
                    pessoa.setNome(scanner.next());
                    System.out.println("Digite a sua idade");
                    pessoa.setIdade(scanner.nextInt());
                    agenda.cadastrarPessoa(pessoa);
                    System.out.println("Contato cadastrado com sucesso!");
                    break;

                case 2:
                    List<Pessoa> pessoas = agenda.buscarPessoas();

                    if(pessoas.isEmpty()) {
                        System.out.println("Não há contato(s)!");
                    } else {
                        for (Pessoa pessoaAuxiliar : pessoas) {
                            System.out.println(pessoaAuxiliar.toString());
                        }
                    }
                    break;

                case 3:
                    pessoa = new Pessoa();
                    System.out.println("Digite qual posição deseja excluir: ");
                    agenda.excluirPessoa(scanner.nextInt());
                    System.out.println("Contato excluido com sucesso!");
                    break;

                case 4:
                    pessoa = new Pessoa();
                    System.out.println("Digite o seu nome");
                    pessoa.setNome(scanner.next());

                    pessoa = agenda.filtrarPessoa(pessoa, 1);
                    System.out.println(pessoa != null ? pessoa.toString() : "Contato não encontrado!");
                    break;

                case 5:
                    System.out.println("A agenda tem " + agenda.verificarQuantidadeContatos() + " contato(s).");
                    break;

                case 6:
                    agenda.apagarAgenda();
                    System.out.println("Sua agenda foi apagada!");
                    break;

                case 100: System.exit(0);
                    break;

                default: System.exit(0);
                    break;
            }

        } while(opcao != 100);
    }
}