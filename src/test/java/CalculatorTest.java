import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
 Calculator calc = new Calculator();

    @Test
    void isPrime() {
        //Arrange
        Calculator calculadora = new Calculator();
        boolean expectedResult=true;

        //Act
        boolean result = calculadora.isPrime(13);

        //Assert
        assertEquals(expectedResult, result);
    }
    @Test
    void isPrime2() {
        //Arrange
        Calculator calculadora = new Calculator();
        boolean expectedResult=false;

        //Act
        boolean result = calculadora.isPrime(14);

        //Assert
        assertEquals(expectedResult, result);
    }


    @Test
    void convertToBinary() {
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
 void testConverteDecimalParaHexa()
 {
  int x;
  String expected, actual;
  x = 14;
  expected = "e";
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
}