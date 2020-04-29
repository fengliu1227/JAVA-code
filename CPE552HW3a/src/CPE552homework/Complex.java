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
        return new Complex(x + a.x, y + a.y);
    }
    public static Complex add(Complex a, Complex b){
        return new Complex(a.x + b.x, a.y + b.y);
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

