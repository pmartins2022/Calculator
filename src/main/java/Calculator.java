public class Calculator
{
<<<<<<< HEAD
    public double produto (double n1, double n2){
        double prod;
        prod=n1*n2;
        return prod;
    }

    public double subtracao (double n1, double n2){
        double sub;
        sub=n1-n2;
        return sub;
    }
=======
 private double lastResultValue;

 /**
  Pessoal pode ser assim? No final de cada método onde ocorreu uma conta é só fazer this.lastResultValue = resulatado
  */
 public double getLastResultValue()
 {
  return lastResultValue;
 }
>>>>>>> 715fec819e4c3b47f1e9b75c5a4aa30078d09b0d
}
