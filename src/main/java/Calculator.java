public class Calculator
{

 private double lastResultValue;

 /**
  * Guarda resultado da operação na variável last resultValue
  */
 public void memorizarResultadoOperacao(double lastResultValue)
 {
  this.lastResultValue = lastResultValue;
 }

 /**
  * Devolve atributo lastResultValue
  *
  * @return atributo lastResultValue
  */
 public double getLastResultValue()
 {
  return lastResultValue;
 }


 public double produto(double n1, double n2)
 {
  double prod;
  prod = n1 * n2;
  return prod;
 }

 public double subtracao(double n1, double n2)
 {
  double sub;
  sub = n1 - n2;
  return sub;
 }

}
