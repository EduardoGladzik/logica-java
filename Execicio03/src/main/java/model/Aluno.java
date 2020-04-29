package model;

import interfaces.AlunoInterface;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 */
public class Aluno implements AlunoInterface {

    private String nome;
    public double[] notas = new double[3];

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
     * @return Retorna o calculo da média aritimética das três notas que o usuário digitará.
     */
    @Override
    public double calcularMediaAritimetica() {
        return (this.notas[0] + this.notas[1] + this.notas[2]) / 3;
    }

    /**
     * @return Retornar o conceito do aluno com base no calculo da média aritimética
     */
    @Override
    public String verificarConceito() {
        if(calcularMediaAritimetica() <= 10 && calcularMediaAritimetica() >= 9)
            return "A";
        else if (calcularMediaAritimetica() <= 8.9 && calcularMediaAritimetica() >= 7)
            return "B";
        else if(calcularMediaAritimetica() <= 6.9 && calcularMediaAritimetica() >= 5)
            return "C";
        else
            return "D";
    }

    /**
     * @return Informações do aluno
     */
    public String toString() {
        return "Aluno: " + this.nome
                + "\nNota 1: " + this.notas[0]
                + "\nNota 2: " + this.notas[1]
                + "\nNota 3: " + this.notas[2]
                + "\nConceito: " + this.verificarConceito();
    }
}
