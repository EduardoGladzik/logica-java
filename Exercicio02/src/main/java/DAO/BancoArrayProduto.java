package DAO;

import interfaces.BancoArrayInterface;
import model.Produto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 */

public class BancoArrayProduto implements BancoArrayInterface{

    Produto produto = new Produto();

    private List<Produto> catalogo;

    public BancoArrayProduto() {this.catalogo = new ArrayList<>();}

    /**
     * @param produto
     */
    @Override
    public void cadastrarProduto(Produto produto) {this.catalogo.add(produto);}

    /**
     * @param index
     * @return retorna o toString do produto selecionado pelo usuário.
     */
    @Override
    public List<String> buscarProduto(int index) {
        return Collections.singletonList(this.catalogo.get(index).toString());
    }

    /**
     * @param index
     */
    @Override
    public void excluirProduto(int index) {this.catalogo.remove(index);}

    /**
     * @param index
     * @param produto
     */
    @Override
    public void alterarProduto(int index, Produto produto) {
        this.catalogo.remove(index);
        this.catalogo.add(index, produto);
    }

    /**
     * @param produto
     * @param filtro
     */
    @Override
    public Produto filtrarProduto(Produto produto, int filtro) {

        /**
         * @return retorna as informações do produto filtrado pelo usuário.
         */
        switch(filtro) {
            case 1: // filtro por marca
                for (Produto produto1 : this.catalogo) {
                    if (produto.getMarca().contains(produto1.getMarca()));
                        return produto1;
                }
                break;

            case 2: // filtro por preços maiores
                for (Produto produto1 : this.catalogo) {
                    if (produto.getPreco() > produto1.getPreco());
                        return produto1;
                }
                break;

            case 3: // filtro por preço 1
                for (Produto produto1 : this.catalogo) {
                    if (produto.getPreco() < produto1.getPreco());
                        return produto1;
                }
                break;

            default:
                System.out.println("Produto não encontrado");
        }
        return null;
    }

    /**
     * @return retorna a quantidade de produtos no catalogo.
     */
    @Override
    public int verificarQuantidadeProdutos() {return this.catalogo.size();}

    @Override
    public void apagarCatalogo() {this.catalogo.clear();}

    /**
     * @return Menu para o usuário utilizar o programa.
     */
    public String returnMenu() {
        return "\tMenu"
                + "\n1. Cadastrar um produto"
                + "\n2. Buscar por um produto"
                + "\n3. Excluir um produto"
                + "\n4. Alterar um produto"
                + "\n5. Filtrar um produto"
                + "\n6. Verificar quantidade de produtos"
                + "\n7. Sair";
    }

    /**
     * @return Menu para o usuário utilizar o filtro.
     */
    public String retornarMenuFiltro() {
        return "\tMenu"
                + "\n1. Filtrar por marca"
                + "\n2. Filtrar por preços maiores"
                + "\n3. Filtrar por preços menores";
    }
}
