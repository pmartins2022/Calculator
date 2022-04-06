<<<<<<< HEAD
import java.util.Objects;

public class BinaryNumber {
    private int value;
=======
public class BinaryNumber
{
 private int binaryValue;
>>>>>>> 4e9f264712f99b17d29cae8349f5becfb8fe28eb

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

<<<<<<< HEAD
    public BinaryNumber sumBinaries(BinaryNumber number) {
        int soma = ConversionUtils.binaryToDecimal(this.value)+ConversionUtils.binaryToDecimal(number.getValue());
        return new BinaryNumber(Integer.parseInt(Integer.toBinaryString(soma)));
    }
=======
 public int multiply(BinaryNumber binaryNumber)
 {
  int x = Integer.parseInt(String.valueOf(this.binaryValue), 2) * Integer.parseInt(String.valueOf(this.binaryValue), 2);
  return Integer.parseInt(Integer.toBinaryString(x));
 }
>>>>>>> 4e9f264712f99b17d29cae8349f5becfb8fe28eb

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

