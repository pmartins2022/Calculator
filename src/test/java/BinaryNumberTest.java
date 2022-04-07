import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberTest
{
 BinaryNumber binaryNumber = new BinaryNumber("100");  //4
 BinaryNumber binaryNumber2 = new BinaryNumber("110"); //6

 @Test
 void sum()
 {
 }

 @Test
 void multiply()
 {
  // Arrange
  BinaryNumber expectedResult = new BinaryNumber("11000"); //24

  // Act
  BinaryNumber result  = binaryNumber.multiply(binaryNumber2);

  // Assert
  assertEquals(expectedResult, result);
 }

 @Test
 void subtraction()
 {
  // Arrange
  BinaryNumber expectedResult = new BinaryNumber(ConversionUtils.decimalToBinary(-2)); //-2

  //Act
  BinaryNumber result  = binaryNumber.subtraction(binaryNumber2);

  // Assert
  assertEquals(expectedResult, result);
 }

 @Test
 void testEquals()
 {
 }
}