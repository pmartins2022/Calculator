import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberTest {

    BinaryNumber binNum = new BinaryNumber("101");
    BinaryNumber binNum2 = new BinaryNumber("101");

    @Test
    void sum() {
        //Arrange
        BinaryNumber expectedResult = new BinaryNumber("1010");

        //Act
        BinaryNumber result = binNum.sum(binNum2);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void multiply() {
    }

    @Test
    void subtraction() {
    }


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