public class Calculator {

    private double lastResultValue;

    /**
     * Guarda resultado da operação na variável last resultValue
     */
    public void memorizarResultadoOperacao(double lastResultValue) {
        this.lastResultValue = lastResultValue;
    }


    /**
     * Pessoal pode ser assim? No final de cada método onde ocorreu uma conta é só fazer this.lastResultValue = resulatado
     */
    public double getLastResultValue() {
        return lastResultValue;
    }
}
