/**
 *
 * @author Feng Liu
 */
public class Quote {
    private String symbol;
    private double price;

    public Quote(String symbol, double price){
        this.symbol = symbol;
        this.price = price;
    }
    public Quote(){
        this("None",0);
    }

    public String toString(){
        return symbol + " price" + " = " + price;
    }
    
    public static void main(String[] args) {
        Quote q1 = new Quote("IBM", 153.41);
        Quote q2 = new Quote("AAPL", 320.03);
        System.out.println(q1); // IBM price=153.41
        System.out.println(q2); // AAPL price=320.03
    }
}