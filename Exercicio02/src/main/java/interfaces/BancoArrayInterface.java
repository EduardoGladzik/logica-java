package interfaces;

import model.Produto;

import java.util.List;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 */
public interface BancoArrayInterface {

    public void cadastrarProduto(Produto produto);
    public List<String> buscarProduto(int index);
    public void excluirProduto(int index);
    public void alterarProduto(int index, Produto produto);
    public Produto filtrarProduto(Produto produto, int filtro);

    public int verificarQuantidadeProdutos();
    public void apagarCatalogo();
}
