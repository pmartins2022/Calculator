public class BinaryNumber {
    private int value;

    public BinaryNumber(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }


    public int sumBinaries(BinaryNumber number) {
        return Integer.parseInt(Integer.toBinaryString(this.value))+Integer.parseInt(Integer.toBinaryString(number.getValue()));
    }


}

