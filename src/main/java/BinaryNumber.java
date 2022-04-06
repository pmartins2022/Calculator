import java.util.Objects;

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


    public BinaryNumber sumBinaries(BinaryNumber number) {
        int soma = ConversionUtils.binaryToDecimal(this.value)+ConversionUtils.binaryToDecimal(number.getValue());
        return new BinaryNumber(Integer.parseInt(Integer.toBinaryString(soma)));
    }


    public String toString(){
        return String.format("%d", value);
    }


    public boolean equals (Object object){
        if(this==object){
            return false;
        }
        if(object==null || this.getClass()!=object.getClass()){
            return false;
        }
        BinaryNumber object2 = (BinaryNumber) object;
        return this.value==object2.getValue();
    }

}

