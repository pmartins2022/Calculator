import java.util.Objects;

public class Hexadecimal {

    private String num1, num2;

    public Hexadecimal(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hexadecimal)) return false;
        Hexadecimal that = (Hexadecimal) o;
        return Objects.equals(num1, that.num1) && Objects.equals(num2, that.num2);
    }

    @Override
    public String toString() {
        return "Hexadecimal{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    


}
