import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{

 Calculator calc = new Calculator();


 @Test
 void isPrime()
 {
  //Arrange
  Calculator calculadora = new Calculator();
  boolean expectedResult = true;

  //Act
  boolean result = calculadora.isPrime(13);

  //Assert
  assertEquals(expectedResult, result);
 }

 @Test
 void isPrime2()
 {
  //Arrange
  Calculator calculadora = new Calculator();
  boolean expectedResult = false;

  //Act
  boolean result = calculadora.isPrime(14);

  //Assert
  assertEquals(expectedResult, result);
 }

 @Test
 void convertToBinary()
 {
  //Arrange
  Calculator calculadora = new Calculator();
  int expectedResult = 1001;

  //Act
  int result = calculadora.convertToBinary(9);

  //Assert
  assertEquals(expectedResult, result);
 }


 @Test
 void testGetLastResultValue()
 {
  //Arrange
  calc.apagarResultado();
  double expectedResult = 0;

  //Act
  double result = calc.getLastResultValue();

  //Assert
  assertEquals(result, expectedResult);
 }

 @Test
 void testPotencia()
 {
  //Arrange
  double expectedResult = 27;

  //Act
  double result = calc.potencia(3, 3);

  //Assert
  assertEquals(result, expectedResult);
 }

 @Test
 void testPotenciaNegativo()
 {
  //Arrange
  double expectedResult = 0.037037037037037035;

  //Act
  double result = calc.potencia(3, -3);

  //Assert
  assertEquals(result, expectedResult);
 }

 @Test
 void testPotenciaZeroValue()
 {
  //Arrange
  double expectedResult = 1;

  //Act
  double result = calc.potencia(3, 0);

  //Assert
  assertEquals(result, expectedResult);
 }

 @Test
 void testBinaryToDecimal()
 {
  //Arrange
  double expectedResult = 4;

  //Act
  double result = calc.binaryToDecimal(100);

  //Assert
  assertEquals(result, expectedResult);
 }


 @Test
 void testSoma()
 {
  double y, x, expected, actual;
  x = 10;
  y = 5;
  expected = 15;
  actual = calc.somar(x, y);
  assertEquals(expected, actual);
 }

 @Test
 void testConverteDecimalParaHexaOneDigit()
 {
  int x;
  String expected, actual;
  x = 14;
  expected = "e";
  actual = calc.converteDecimalParaHexa(x);
  assertEquals(expected, actual);
 }

 @Test
 void testConverteDecimalParaHexaMultipleDigit()
 {
  int x;
  String expected, actual;
  x = 255;
  expected = "ff";
  actual = calc.converteDecimalParaHexa(x);
  assertEquals(expected, actual);
 }

 @Test
 public void testCalculateFatorial1()
 {
  Calculator c = new Calculator();

  long result = c.fatorial(10);

  assertEquals(3628800, result);
 }

 @Test
 public void testCalculateFatorial2()
 {
  Calculator c = new Calculator();

  long result = c.fatorial(-5);

  assertEquals(-120, result);
 }


 @Test
 void testProduto()
 {
  double n1, n2, expected, actual;
  n1 = 10;
  n2 = 5;
  expected = 15;
  actual = calc.produto(n1, n2);
  assertEquals(expected, actual);
 }

 @Test
 void testSubtracaoInteiros()
 {
  double n1, n2, expected, actual;
  n1 = 10;
  n2 = 5;
  expected = 5;
  actual = calc.subtracao(n1, n2);
  assertEquals(expected, actual);
 }

 @Test
 void testSubtracaoReais()
 {
  double n1, n2, expected, actual;
  n1 = 10.97f;
  n2 = 0.12f;
  expected = 10.85f;
  actual = calc.subtracao(n1, n2);
  assertEquals(expected, actual);
 }

 @Test
 void testSubtracaoResultadoNegativo()
 {
  double n1, n2, expected, actual;
  n1 = 0.5f;
  n2 = 2.25f;
  expected = 1.75f;
  actual = calc.subtracao(n1, n2);
  assertEquals(expected, actual);
 }

}