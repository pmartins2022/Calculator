/**
 * Classe de utilidades de conversao para colocar numa calculador cientifica
 */

public class ConversionUtils
{
    public static String decimalToBinary(int number)
    {
        return Integer.toBinaryString(number);
    }

    public static String decimalToHex(int number)
    {
        return Integer.toHexString(number);
    }

    public static int binaryToDecimal(int number)
    {
        return Integer.parseInt(String.valueOf(number),2);
    }

}
