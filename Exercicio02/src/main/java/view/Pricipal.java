package view;


import DAO.BancoArrayProduto;
import model.Produto;

import java.util.Scanner;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 */
public class Pricipal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BancoArrayProduto catalogo = new BancoArrayProduto();

        int opcao = 0;
        Produto produto = new Produto();

        do {
            System.out.println(catalogo.returnMenu());
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Digite a marca do produto");
                    produto.setMarca(scanner.next());
                    System.out.println("Digite o preço do produto");
                    produto.setPreco(scanner.nextDouble());
                    System.out.println("Digite a quantidade");
                    produto.setQuantidade(scanner.nextInt());
                    catalogo.cadastrarProduto(produto);
                    System.out.println("produto cadastrado com sucesso.");
                    break;
                case 2:
                    System.out.println("Informe a posição do produto que você deseja");

                    System.out.println(catalogo.buscarProduto(scanner.nextInt()));
                    break;
                case 3:
                    System.out.println("Digite o código do produto que você quer excluir");
                    catalogo.excluirProduto(scanner.nextInt());
                    System.out.println("Produto excluido com sucesso.");
                    break;
                case 4:
                    System.out.println("Informe o código do produto que deseja alterar, após digite o novo produto.");
                    catalogo.alterarProduto(scanner.nextInt(), produto);
                    System.out.println("Digite a nova marca do produto");
                    produto.setMarca(scanner.next());
                    System.out.println("Digite o novo preço do produto");
                    produto.setPreco(scanner.nextDouble());
                    System.out.println("Digite a nova quantidade");
                    produto.setQuantidade(scanner.nextInt());
                    System.out.println("Produto alterado com sucesso.");
                    break;
                case 5:
                    produto = new Produto();
                    int opcao2;
                    System.out.println(catalogo.retornarMenuFiltro());
                    opcao2 =scanner.nextInt();
                    if(opcao2 == 1) {
                        System.out.println("Digite a marca");
                        produto.setMarca(scanner.next());
                    } else if (opcao2 == 2  || opcao2 == 3) {
                        System.out.println("Digite o preço");
                        produto.setPreco(scanner.nextDouble());
                    }
                    System.out.println(catalogo.filtrarProduto(produto, opcao2));
                    break;
                case 6:
                    System.out.println("O catalogo possui " + catalogo.verificarQuantidadeProdutos() + " produto(s)");
                    break;
                case 7:
                    System.out.println("Sistema encerrado.");
                    System.exit(0);
                default:
                    System.exit(0);
            }
        } while (opcao != 7);

    }
}
