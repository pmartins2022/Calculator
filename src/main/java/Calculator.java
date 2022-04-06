public class Calculator
{
 private double lastResultValue;

 /**
  Pessoal pode ser assim? No final de cada método onde ocorreu uma conta é só fazer this.lastResultValue = resultado
  */
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
}
