import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{


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
}