import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
 Calculator calculator = new Calculator();

 @Test
 void getLastResultValue()
 {
  //Arrange

  //Act
  calculator.apagarResultado();
  double result = calculator.getLastResultValue();
  double expectedResult = 0;
  //Assert
  assertEquals(result, expectedResult);
 }

 @Test
 void potencia()
 {
  //Arrange

  //Act
  double result = calculator.potencia(3, 3);
  double expectedResult = 27;
  //Assert
  assertEquals(result, expectedResult);
 }

 @Test
 void binaryToDecimal()
 {
  //Arrange

  //Act
  double result = calculator.binaryToDecimal(100);
  double expectedResult = 4;
  //Assert
  assertEquals(result, expectedResult);
 }
}