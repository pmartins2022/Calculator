public class BinaryNumber {

    private String binaryValue;


    public BinaryNumber(String value) {
        this.binaryValue = value;
    }


    public String getBinaryValue() {
        return binaryValue;
    }
    public void setBinaryValue(String binaryValue) {
        this.binaryValue = binaryValue;
    }


    public BinaryNumber sum(BinaryNumber number) {
        int sum = ConversionUtils.binaryToDecimal(Integer.parseInt(this.binaryValue)) +
                ConversionUtils.binaryToDecimal(Integer.parseInt(number.getBinaryValue()));
        return new BinaryNumber(ConversionUtils.decimalToBinary(sum));
    }

    public BinaryNumber multiply(BinaryNumber binaryNumber) {
        int multiply = ConversionUtils.binaryToDecimal(Integer.parseInt(this.binaryValue)) *
                ConversionUtils.binaryToDecimal(Integer.parseInt(binaryNumber.getBinaryValue()));
        return new BinaryNumber(ConversionUtils.decimalToBinary(multiply));
    }

    public BinaryNumber subtraction(BinaryNumber binaryNumber) {
        int sub= ConversionUtils.binaryToDecimal(Integer.parseInt(this.binaryValue)) -
                ConversionUtils.binaryToDecimal(Integer.parseInt(binaryNumber.getBinaryValue()));
        return new BinaryNumber(ConversionUtils.decimalToBinary(sub));
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

