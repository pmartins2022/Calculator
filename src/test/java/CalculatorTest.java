import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
<<<<<<< HEAD
    Calculator calc = new Calculator ();

    @Test
    void testSoma ()
    {
        double y, x, expected, actual;
        x = 10;
        y = 5;
        expected = 15;
        actual = calc.somar (x, y);
        assertEquals (expected, actual);
    }
=======
 Calculator calc = new Calculator();
>>>>>>> 27a1017c41d7f8d04dcdc2480696ff6d83f36ba9

 @Test
 void testGetLastResultValue()
 {
  //Arrange

  //Act
  calc.apagarResultado();
  double result = calc.getLastResultValue();
  double expectedResult = 0;
  //Assert
  assertEquals(result, expectedResult);
 }

 @Test
 void testPotencia()
 {
  //Arrange

  //Act
  double result = calc.potencia(3, 3);
  double expectedResult = 27;
  //Assert
  assertEquals(result, expectedResult);
 }

 @Test
 void testBinaryToDecimal()
 {
  //Arrange

  //Act
  double result = calc.binaryToDecimal(100);
  double expectedResult = 4;
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
 void testConverteDecimalParaHexaOneDigit ()
 {
  int x;
  String expected, actual;
  x = 14;
  expected = "e";
  actual = calc.converteDecimalParaHexa (x);
  assertEquals (expected, actual);
 }

 @Test
 void testConverteDecimalParaHexaMultipleDigit ()
 {
  int x;
  String expected, actual;
  x = 255;
  expected = "ff";
  actual = calc.converteDecimalParaHexa (x);
  assertEquals (expected, actual);
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

<<<<<<< HEAD
        assertEquals(-120, result);
    }

    @Test
    void testProduto (){
        double n1,n2,expected, actual;
        n1 = 10;
        n2 = 5;
        expected = 15;
        actual = calc.produto(n1,n2);
        assertEquals(expected,actual);
    }

    @Test
    void testSubtracaoInteiros () {
        double n1,n2,expected, actual;
        n1 = 10;
        n2 = 5;
        expected=5;
        actual = calc.subtracao(n1,n2);
        assertEquals(expected,actual);
    }

    @Test
    void testSubtracaoReais (){
        double n1,n2,expected, actual;
        n1 = 10.97f;
        n2 = 0.12f;
        expected = 10.85f;
        actual = calc.subtracao(n1,n2);
        assertEquals(expected, actual);
    }

    @Test
    void testSubtracaoResultadoNegativo (){
        double n1,n2,expected, actual;
        n1 = 0.5f;
        n2 = 2.25f;
        expected = 1.75f;
        actual = calc.subtracao(n1,n2);
        assertEquals(expected,actual);
    }
=======
>>>>>>> 27a1017c41d7f8d04dcdc2480696ff6d83f36ba9
}