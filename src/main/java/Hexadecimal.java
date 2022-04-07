import java.util.Objects;

public class Hexadecimal {

    private String num;

    public Hexadecimal(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "num: " + num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hexadecimal that = (Hexadecimal) o;
        return Objects.equals(num, that.num);
    }

    public Hexadecimal produtoHexadecimal(Hexadecimal outro){
        int prod = Integer.parseInt(this.num,16) * Integer.parseInt(outro.num, 16) ;
        return new Hexadecimal(ConversionUtils.decimalToHex(prod));
    }

    public Hexadecimal somaHexadecimal (Hexadecimal outro){
        int soma = Integer.parseInt(this.num,16)+Integer.parseInt(outro.num,16);
        return new Hexadecimal(ConversionUtils.decimalToHex(soma));
    }

    public Hexadecimal subtracaoHexadecimal (Hexadecimal outro){
        int soma = Integer.parseInt(this.num,16)-Integer.parseInt(outro.num,16);
        return new Hexadecimal(ConversionUtils.decimalToHex(soma));
    }



}
