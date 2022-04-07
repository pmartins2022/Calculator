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

 public BinaryNumber sumBinaries(BinaryNumber number)
 {
  return new BinaryNumber(String.valueOf(ConversionUtils.binaryToDecimal(Integer.parseInt(this.binaryValue))
          + ConversionUtils.binaryToDecimal(Integer.parseInt(number.getValue()))));
 }

 public BinaryNumber multiply(BinaryNumber binaryNumber)
 {
  return new BinaryNumber(String.valueOf(ConversionUtils.binaryToDecimal(Integer.parseInt(this.binaryValue))
          * ConversionUtils.binaryToDecimal(Integer.parseInt(binaryNumber.binaryValue))));
 }

 public BinaryNumber subtraction(BinaryNumber binaryNumber)
 {
  return new BinaryNumber(String.valueOf(ConversionUtils.binaryToDecimal(Integer.parseInt(this.binaryValue))
          - ConversionUtils.binaryToDecimal(Integer.parseInt(binaryNumber.binaryValue))));
 }

 public String toString()
 {
  return String.format("%s", binaryValue);
 }


 public boolean equals(Object object)
 {
  if (this == object)
  {
   return false;
  }
  if (object == null || this.getClass() != object.getClass())
  {
   return false;
  }
  BinaryNumber object2 = (BinaryNumber) object;
  return this.binaryValue == object2.getValue();
 }

}


