package model;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 */
public class Produto {

    private String marca;
    private double preco;
    private int quantidade;
    private int codigo;

    public String getMarca() {
        return marca;
    }

    /**
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    /**
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    /**
     * @param quantididade
     */
    public void setQuantidade(int quantididade) {
        this.quantidade = quantididade;
    }

    public int getCodigo() {
        return this.codigo;
    }

    /**
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double calcularPrecoTotal() {
        return this.preco * this.quantidade;
    }

    /**
     * @return Informaçõe do produto
     */
    public String toString() {
        return "\tProduto"
                + "\nMarca: " + this.marca
                + "\nPreço: " + this.preco
                + "\nQuantidade: " + this.quantidade;
    }
}

