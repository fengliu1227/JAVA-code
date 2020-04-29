/**
 *
 * @author Feng Liu
 */
public class Complex {
    private double x, y;
    public Complex(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Complex(){
        this(0,0);
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public Complex add(Complex b){
        return new Complex(b.x + this.x, this.y + b.y);
    }
    public Complex sub(Complex b){
        return new Complex(this.x - b.x, this.y - b.y);
    }

    public static void main(String[] args) {
        Complex a = new Complex(1.5, 2.1);
        Complex b = new Complex(-1.2, 3.3);
        Complex c = a.add(b); // should be (0.3, 5.4)
        System.out.println(a + " + " + b + " = " + c);
        // (1.5,2.1) + (-1.2,3.3) = (0.3,5.4)
    }
}