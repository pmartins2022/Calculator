public class BinaryNumber
{
 private int value; // value = 1001      value = 1111

 public BinaryNumber(int value)
 {
  this.value = value;
 }

 public int multiply(BinaryNumber binaryNumber)
 {
  return Integer.parseInt(String.valueOf(this.value)) * Integer.parseInt(String.valueOf(binaryNumber.value));
 }


}

