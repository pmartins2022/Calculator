import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {

    @Test
    void produtoHexadecimal()
    {
        //Arrange
        Hexadecimal n1 = new Hexadecimal("23");
        Hexadecimal n2 = new Hexadecimal("ae");
        Hexadecimal expected = new Hexadecimal("17ca");
        //Act
        Hexadecimal res = n1.produtoHexadecimal(n2);
        //Assert
        assertEquals(expected, res);

    }
}