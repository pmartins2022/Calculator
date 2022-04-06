<<<<<<< HEAD
<<<<<<< HEAD

    /**
     * Calcula o Produto de dois numeros
     * @param n1 numero fornecido em primeiro lugar
     * @param n2 numero fornecido em segundo lugar
     * @return produto de n1 com n2
     */
=======
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

    
>>>>>>> 8fd0c3b69099a73c91209cccdda5d88b7279da90
    public double produto (double n1, double n2){
        double prod;
        prod=n1*n2;
        return prod;
    }

    /**
     * Calcula a subtracao de dois numeros
     * @param n1 numero fornecid em primeiro lugar
     * @param n2 numero fornecido em segundo lugar
     * @return subtracao de n2 a n1
     */
    public double subtracao (double n1, double n2){
        double sub;
        sub=n1-n2;
        return sub;
    }
<<<<<<< HEAD

    private double lastResultValue;

 /**
  Pessoal pode ser assim? No final de cada método onde ocorreu uma conta é só fazer this.lastResultValue = resultado
  */
<<<<<<< HEAD
 public double getLastResultValue()
 {
  return lastResultValue;
 }

 public double somar(int x, int y)
 {
  return x+y;
 }

 public void apagarResultado()
 {
  lastResultValue = Double.parseDouble (null);
 }
=======
    public double getLastResultValue()
    {
        return lastResultValue;
    }
=======
>>>>>>> 8fd0c3b69099a73c91209cccdda5d88b7279da90
>>>>>>> 19bbd43217b3da49005c4a93672ca5aa6ddc37f0
}
