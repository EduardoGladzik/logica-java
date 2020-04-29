package model;

/**
 * @author Eduardo Gladzik, Christopher e Luís
 * @verison 1.0
 * @since 09/04/2020 14:15
 */
public class Nadador {

    public Nadador() {
    }

    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    /**
     * @param idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Retorna a categoria em que o usuário se encaixa em relação a sua idade.
     */
    public String verificarCategoria() {
        if (this.idade < 8)
            return "não pode ser nadador";
        else if (this.idade >= 8 && this.idade <= 10)
            return "Infantil";
        else if (this.idade >= 11 && this.idade <= 17)
            return "Juvenil";
        else
            return "Adulto";
    }
}
