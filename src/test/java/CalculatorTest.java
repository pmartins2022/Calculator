import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
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