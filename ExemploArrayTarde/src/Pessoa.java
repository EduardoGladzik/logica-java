/**
 * @author thiago-cury
 * @since 07/04/2020
 * @version 1.0
 */
public class Pessoa {

    private String nome;
    private int idade;

    //ALT + INSERT
    public Pessoa() {
    }

    /**
     *
     * @param nome recebe o nome da pessoa
     * @param idade recebe a idade da pessoa
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
     * @return retorna a idade vezes 12
     */
    public int calcularIdadeMeses() {
        return this.idade * 12;
    }

    @Override
    public String toString() {
        return "\nnome : " + nome
             + "\nidade : " + idade
             + "\nidade em meses: " + this.calcularIdadeMeses();
    }
}
