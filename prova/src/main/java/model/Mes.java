package model;

/**
 * @author Eduardo Gladzik, Christopher e Luís
 * @version 1.0
 * @since 09/04/2020 13:10
 */
public class Mes {

    private int mesDeNascimento;

    public Mes() {
    }

    public int getMesDeNascimento() {
        return mesDeNascimento;
    }

    /**
     * @param mesDeNascimento
     */
    public void setMesDeNascimento(int mesDeNascimento) {
        this.mesDeNascimento = mesDeNascimento;
    }

    /**
     * @return Retorna qual trimestre do ano o usuário nasceu.
     */
    public String verificarTrimestre() {
        if (this.mesDeNascimento >= 1 && this.mesDeNascimento <= 3)
            return "1° Trimestre";
        else if (this.mesDeNascimento >= 4 && this.mesDeNascimento <= 6)
            return "2° Trimestre";
        else if (this.mesDeNascimento >= 7 && this.mesDeNascimento <= 9)
            return "3° Trimestre";
        else
            return "4° Trimestre";
    }

    /**
     * @return Retorna o mês de nascimento do usuário
     */
    public String toString() {
        return "Mês de nascimento: " + this.mesDeNascimento;
    }
}
