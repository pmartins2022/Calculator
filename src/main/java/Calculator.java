public class Calculator
{
    private double lastResultValue;

    /**
     * Guarda resultado da operação na variável last resultValue
     *
     * @param lastResultValue resultado da última operação
     */
    public void memorizarResultadoOperacao(double lastResultValue)
    {
        this.lastResultValue = lastResultValue;
    }


    /**
     * Pessoal pode ser assim? No final de cada método onde ocorreu uma conta é só fazer this.lastResultValue = resulatado
     */
    public double getLastResultValue()
    {
        return lastResultValue;
    }


    /**
     * Calcula o Produto de dois numeros
     *
     * @param n1 numero fornecido em primeiro lugar
     * @param n2 numero fornecido em segundo lugar
     * @return produto de n1 com n2
     */
    public double produto(double n1, double n2)
    {
        double prod;
        prod = n1 * n2;
        return prod;
    }

    /**
     * Calcula a subtracao de dois numeros
     *
     * @param n1 numero fornecid em primeiro lugar
     * @param n2 numero fornecido em segundo lugar
     * @return subtracao de n2 a n1
     */
    public double subtracao(double n1, double n2)
    {
        double sub;
        sub = n1 - n2;
        return sub;
    }

    public double somar(double x, double y)
    {
        double soma;
        soma = x + y;
        return soma;
    }

    public void apagarResultado()
    {
        lastResultValue = Double.parseDouble(null);
    }
}
