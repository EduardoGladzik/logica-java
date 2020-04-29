package model;

/**
 *
 */
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {
    }

    /**
     *
     * @param nome
     * @param idade
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *
     * @return dafsadfdf
     */
    public int calcularIdadeMeses() {
        return this.idade * 12;
    }

    @Override
    public String toString() {
        return  "\nnome " + nome
                + "\nidade " + idade
                + "\nidade em meses " + this.calcularIdadeMeses();
    }
}