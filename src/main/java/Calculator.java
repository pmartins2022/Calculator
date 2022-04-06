public class Calculator
{
 private double lastResultValue;

 /**
  * 5) Guarda resultado da operação na variável last resultValue
  *
  * @param lastResultValue resultado da última operação
  */
 public void saveLastResult(double lastResultValue)
 {
  this.lastResultValue = lastResultValue;
 }

 /**
  * Devolve valor do atributo lastResultValue
  *
  * @return valor do atributo lastResultValue
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
  saveLastResult(prod);
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
  saveLastResult(sub);
  return sub;
 }

 public double somar(double x, double y)
 {
  double soma;
  soma = x + y;
  saveLastResult(soma);
  return soma;
 }

 public void apagarResultado()
 {
  lastResultValue = 0d;
 }

 public double quociente(double x, double y)
 {
  double t = x / y;
  saveLastResult(t);
  return t;
 }


 public long fatorial(double x)
 {
  int num = (int) x;

  long result = 1;

  while (num != 1)
  {
   result = result * num;
   num--;
  }

  saveLastResult(result);
  return result;
 }

 public boolean isPrime(int number)
 {
  boolean flag = true;
  int x = 2;
  while (number % x != 0 && x <= number / 2)
  {
   x = x + 1;
  }
  if (x < number / 2)
  {
   flag = false;
   return flag;
  } else
  {
   return flag;
  }
 }


 public int convertToBinary(int number)
 {
  String binary = ConversionUtils.decimalToBinary(number);
  return Integer.parseInt(binary);
 }

 /**
  * Calcula a potência do valor recebido pela variável x
  *
  * @param x número
  * @param y potência
  * @return potência do número
  */
 public double potencia(double x, int y)
 {
  double z = Math.pow(x, y);
  saveLastResult(z);
  return z;
 }

}

