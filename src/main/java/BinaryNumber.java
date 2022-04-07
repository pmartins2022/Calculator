public class BinaryNumber
{

 private String binaryValue;

<<<<<<< HEAD
    private String binaryValue;

    public BinaryNumber(String value) {
        this.binaryValue = value;
    }
=======
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

>>>>>>> 9c3b070d9ca2e911dceb491c8db18a58f0620d53


    public String getBinaryValue() {
        return binaryValue;
    }

    public void setBinaryValue(String binaryValue) {
        this.binaryValue = binaryValue;
    }


    public BinaryNumber sum(BinaryNumber number) {
        int sum= ConversionUtils.binaryToDecimal(Integer.parseInt(this.binaryValue)) +
                ConversionUtils.binaryToDecimal(Integer.parseInt(number.getBinaryValue()));
        return new BinaryNumber(ConversionUtils.decimalToBinary(sum));
    }

    public int multiply(BinaryNumber binaryNumber) {
        int x = Integer.parseInt(String.valueOf(this.binaryValue), 2) * Integer.parseInt(String.valueOf(this.binaryValue), 2);
        return Integer.parseInt(Integer.toBinaryString(x));
    }

    public int subtraction(BinaryNumber binaryNumber) {
        int x = Integer.parseInt(Integer.toBinaryString(this.binaryValue)) - Integer.parseInt(Integer.toBinaryString(binaryNumber.getValue()));
        return Integer.parseInt(Integer.toBinaryString(x));
    }

    public String toString() {
        return binaryValue;
    }


    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        BinaryNumber object2 = (BinaryNumber) object;
        return this.binaryValue.equalsIgnoreCase(object2.getBinaryValue());
    }

}

