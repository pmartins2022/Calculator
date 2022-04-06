import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
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

    @Test
    void testConverteDecimalParaHexa ()
    {
        int x;
        String expected, actual;
        x = 14;
        expected = "e";
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
}