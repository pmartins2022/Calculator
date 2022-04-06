public class BinaryNumber
{
 private int binaryValue;

 public BinaryNumber(int value)
 {
  this.binaryValue = value;
 }


 public int getValue()
 {
  return binaryValue;
 }

 public void setValue(int value)
 {
  this.binaryValue = value;
 }

 public int multiply(BinaryNumber binaryNumber)
 {
  int x = Integer.parseInt(String.valueOf(this.binaryValue), 2) * Integer.parseInt(String.valueOf(this.binaryValue), 2);
  return Integer.parseInt(Integer.toBinaryString(x));
 }

 public int sumBinaries(BinaryNumber number)
 {
  int x = Integer.parseInt(Integer.toBinaryString(this.binaryValue)) + Integer.parseInt(Integer.toBinaryString(number.getValue()));
  return Integer.parseInt(Integer.toBinaryString(x));
 }

 public int subtraction(BinaryNumber binaryNumber)
 {
  int x = Integer.parseInt(Integer.toBinaryString(this.binaryValue)) - Integer.parseInt(Integer.toBinaryString(binaryNumber.getValue()));
  return Integer.parseInt(Integer.toBinaryString(x));
 }

}

