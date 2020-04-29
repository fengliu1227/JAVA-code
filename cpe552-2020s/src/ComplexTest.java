import java.math.BigDecimal;
class Complex{
    private double x, y;
    public Complex(double x, double y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

    public Complex add(Complex a){
        BigDecimal x1 = new BigDecimal(Double.toString(this.x));
        BigDecimal x2 = new BigDecimal(Double.toString(a.x));
        BigDecimal y1 = new BigDecimal(Double.toString(this.y));
        BigDecimal y2 = new BigDecimal(Double.toString(a.y));
        return new Complex(x1.add(x2).doubleValue(), y1.add(y2).doubleValue());
    }
    public static Complex add(Complex a, Complex b){
        BigDecimal x1 = new BigDecimal(Double.toString(a.x));
        BigDecimal x2 = new BigDecimal(Double.toString(b.x));
        BigDecimal y1 = new BigDecimal(Double.toString(a.y));
        BigDecimal y2 = new BigDecimal(Double.toString(b.y));
        return new Complex(x1.add(x2).doubleValue(), y1.add(y2).doubleValue());
    }
    public void print(){
        System.out.println("(" + this.x + "," + this.y + ")");
    }
}
public class ComplexTest {
    public static void main(String[] args) {
        Complex a = new Complex(2.5, 3.1);
        Complex b = new Complex(-3.9, 4.2);
        Complex c = a.add(b); // a regular method
        Complex d = Complex.add(a,b); // use a static function
        d.print(); // write a method print to print out (-1.4,7.3)
        System.out.println(d); // print the same way.
    }
}
