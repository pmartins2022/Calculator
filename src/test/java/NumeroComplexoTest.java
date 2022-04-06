import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeroComplexoTest
{

    @Test
    void testSomar ()
    {
        NumeroComplexo n1 = new NumeroComplexo (5,10);
        NumeroComplexo n2 = new NumeroComplexo (20,30);
        NumeroComplexo expected = new NumeroComplexo (25, 40);
        NumeroComplexo actual = n1.somar (n2);
        assertEquals (expected, actual);
    }

    @Test
    void testProduto ()
    {
        NumeroComplexo n1 = new NumeroComplexo (1,0);
        NumeroComplexo n2 = new NumeroComplexo (0,1);
        NumeroComplexo expected = new NumeroComplexo (0,1 );
        NumeroComplexo actual = n1.produto (n2);
        assertEquals (expected, actual);
    }
}