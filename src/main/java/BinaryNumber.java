import java.util.Objects;

public class BinaryNumber {

        private int binaryValue;

        public BinaryNumber(int value) {
            this.binaryValue = value;
        }


        public int getValue() {
            return binaryValue;
        }

        public void setValue(int value) {
            this.binaryValue = value;
        }

        public BinaryNumber sumBinaries(BinaryNumber number) {
            int soma = ConversionUtils.binaryToDecimal(this.binaryValue) + ConversionUtils.binaryToDecimal(number.getValue());
            return new BinaryNumber(Integer.parseInt(Integer.toBinaryString(soma)));
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
            return String.format("%d", binaryValue);
        }


        public boolean equals(Object object) {
            if (this == object) {
                return false;
            }
            if (object == null || this.getClass() != object.getClass()) {
                return false;
            }
            BinaryNumber object2 = (BinaryNumber) object;
            return this.binaryValue == object2.getValue();
        }

    }

