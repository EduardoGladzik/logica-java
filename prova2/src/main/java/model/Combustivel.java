package model;
import java.util.ArrayList;
/**
 * @author Eduardo Gladzik, Christopher e Luís
 * @version 1.0
 * @since 09/04/2020 13:30
 */
public class Combustivel {

    private double quantidadeDeLitros;
    private int tipoDeCombustivel;
    public double[] precoDoCombustivel = new double[4];

    /**
     * Setando os valores dos combustíveis.
     */
    public Combustivel() {
        this.precoDoCombustivel[0] = 4.49;
        this.precoDoCombustivel[1] = 3.68;
        this.precoDoCombustivel[2] = 3.71;
        this.precoDoCombustivel[3] = this.precoDoCombustivel[0] + this.precoDoCombustivel[1];
    }

    public double getQuantidadeDelitros() {
        return quantidadeDeLitros;
    }

    /**
     * @param quantidadeDelitros
     */
    public void setQuantidadeDelitros(double quantidadeDelitros) {
        this.quantidadeDeLitros = quantidadeDelitros;
    }

    public int getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    /**
     * @param tipoDeCombustivel
     */
    public void setTipoDeCombustivel(int tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    /**
     * @param index
     * @method Calcula a quantidade de litros em razão do preço do combustível escolhi pelo usuário.
     * @return Retorna o valor total.
     */
    public double calcularValorPagar(int index) {
        return this.quantidadeDeLitros * precoDoCombustivel[index];
    }

    /**
     * @return Menu para o usuário escolher o tipo de combustível.
     */
    public String retoranrMenu() {
            return ":::::::::::::::::::::::::::::::::::\n"
                    + ": 0- Gasolina ---------- R$ 4.49  :\n"
                    + ": 1- Álcool ------------ R$ 3.68  :\n"
                    + ": 2- Diesel ------------ R$ 3.71  :\n"
                    + ": 3- Flex                         :\n"
                    + ": 4- Sair do sistema              :\n"
                    + ":::::::::::::::::::::::::::::::::::";
    }

    /**
     * @param index
     * @method Switch do menu de combustíveis.
     * @return Retorna o valor total a ser pago pelo usuário.
     */
    public double retornarSwitch(int index) {
            switch (index) {
                case 0:
                    return calcularValorPagar(index);
                case 1:
                    return calcularValorPagar(index);
                case 2:
                    return calcularValorPagar(index);
                case 3:
                    return calcularValorPagar(index);
                case 4:
                    System.exit(0);
                    break;
            }
            return 0;
    }

    /**
     * @return Informações sobre o combustível.
     */
    public String toString() {
        return "Quantidade de litros: " + this.quantidadeDeLitros
                + "\nTipo de combustível: " + this.tipoDeCombustivel
                + "\nPreço da gasolina: " + this.precoDoCombustivel[0]
                + "\nPreço do álcool: " + this.precoDoCombustivel[1]
                + "\nPreço do diesel: " + this.precoDoCombustivel[2]
                + "\nPreço do combustível flex: " + this.precoDoCombustivel[0] + " " + this.precoDoCombustivel[1];
    }
}
