public class BinaryNumber
{
 private String binaryValue;

 public BinaryNumber(String value)
 {
  this.binaryValue = value;
 }

 public String getValue()
 {
  return binaryValue;
 }

 public void setValue(String value)
 {
  this.binaryValue = value;
 }

 public BinaryNumber multiply(BinaryNumber binaryNumber)
 {
  return new BinaryNumber(String.valueOf(ConversionUtils.binaryToDecimal(Integer.parseInt(this.binaryValue))
          * ConversionUtils.binaryToDecimal(Integer.parseInt(binaryNumber.binaryValue))));
 }

 public BinaryNumber sumBinaries(BinaryNumber number)
 {
  return new BinaryNumber(String.valueOf(Integer.parseInt(Integer.toBinaryString(Integer.parseInt(this.binaryValue))) +
          Integer.parseInt(Integer.toBinaryString(number.getValue()))));
 }

 public BinaryNumber subtraction(BinaryNumber binaryNumber)
 {
  return new BinaryNumber(String.valueOf(ConversionUtils.binaryToDecimal(Integer.parseInt(this.binaryValue))
          - ConversionUtils.binaryToDecimal(Integer.parseInt(binaryNumber.binaryValue))));
 }

}

