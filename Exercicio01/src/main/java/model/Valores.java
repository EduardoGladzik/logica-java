package model;
/**
* @author Eduardo Gladzik
* @version 1.0
*/

public class Valores {

    private double valorX1;
    private double valorY1;
    private double valorX2;
    private double valorY2;

    public double getValorX1() {
        return this.valorX1;
    }

    /**
       * @param valorX1;
     */
    public void setValorX1(double valorX1) {
        this.valorX1 = valorX1;
    }

    public double getValorY1() {
        return this.valorY1;
    }

    /**
     * @param valorY1;
     */
    public void setValorY1(double valorY1) {
        this.valorY1 = valorY1;
    }

    public double getValorX2() {
        return valorX2;
    }

    /**
     * @param valorX2;
     */
    public void setValorX2(double valorX2) {
        this.valorX2 = valorX2;
    }

    public double getValorY2() {
        return valorY2;
    }

    /**
     * @param valorY2;
     */
    public void setValorY2(double valorY2) {
        this.valorY2 = valorY2;
    }

    /**
      *  @return Calculo da distancia entre dois pontos em um plano cartesiano.
     */
    public double calcularDistanciaEntreDoisPontosNoPlanoCartesiano() {
        return Math.sqrt(Math.pow((this.valorX2 - this.valorX1), 2) + Math.pow((this.valorY2 - this.valorY1), 2));
    }

    /**
      *  @return Subtração do valorY1 pelo valorX1, calculo da distancia entre esses dois pontos.
     */
    public double calcularDistanciaEntreOsPontosX1eY1() {
        return this.valorY1 - this.valorX1;
    }

    /**
     *  @return Subtração do valorY2 pelo valorX2, calculo da distancia entre esses dois pontos.
     */
    public double calcularDistanciaEnreOsPontosY2eX2() {
        return this.valorY2 - this.valorX2;
    }


}
