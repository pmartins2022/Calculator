public class NumeroComplexo
{
 private double x, y;

 public NumeroComplexo(double x, double y)
 {
  this.x = x;
  this.y = y;
 }

 public NumeroComplexo somar(NumeroComplexo n2)
 {
  return new NumeroComplexo(this.x + n2.x, this.y + n2.y);
 }

 public NumeroComplexo produto(NumeroComplexo n2)
 {
  return new NumeroComplexo(this.x * n2.x - this.y * n2.y, this.x * n2.y + n2.x * this.y);
 }

 @Override
 public String toString()
 {
  return x + (y > 0 ? " + " + y : y < 0 ? " " + y : " + ") + "i";
 }

 @Override
 public boolean equals(Object o)
 {
  if (this == o) return true;
  if (!(o instanceof NumeroComplexo)) return false;

  NumeroComplexo that = (NumeroComplexo) o;

  if (Double.compare(that.x, x) != 0) return false;
  return Double.compare(that.y, y) == 0;
 }
}
