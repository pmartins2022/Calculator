import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

<<<<<<< HEAD
class BinaryNumberTest {

    BinaryNumber binNum = new BinaryNumber("101");
    BinaryNumber binNum2 = new BinaryNumber("101");

    @Test
    void sum() {
        //Arrange
        BinaryNumber expectedResult = new BinaryNumber("1010");
=======
class BinaryNumberTest
{
 BinaryNumber binaryNumber = new BinaryNumber("100");  //4
 BinaryNumber binaryNumber2 = new BinaryNumber("110"); //6
>>>>>>> 64d75ac282b20c21a4efbfc78177a3f9830fd0be

        //Act
        BinaryNumber result = binNum.sum(binNum2);

<<<<<<< HEAD
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void multiply() {
    }

    @Test
    void subtraction() {
    }
=======
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
>>>>>>> 64d75ac282b20c21a4efbfc78177a3f9830fd0be


    @Test
    void testEquals() {
        //Arrange
        boolean expectedResult = true;

        //Act
        boolean result = binNum.equals(binNum);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testEquals2() {
        //Arrange
        Object object = new Object();
        boolean expectedResult = false;

        //Act
        boolean result = binNum.equals(object);

        //Assert
        assertEquals(expectedResult, result);
    }
}