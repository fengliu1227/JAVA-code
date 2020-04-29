import java.util.*;
/**
 *
 * @author fengliu
 */
class Point{
    private int x,y;
    public Point(int x, int y){
        this.x = x; this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
public class ListTest {
    public static void main(String args[]){
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point (2,3));
        points.add(new Point(4,100));
        
        for (int i = 0; i < points.size(); i++){
             System.out.println(i);
        }
        System.out.println();
        for(Iterator<Point> i = points.iterator();i.hasNext();){
            Point p = i.next();
            System.out.print(p+" ");
        }
        System.out.println();
        for(Point p : points){
            System.out.print(p+" ");
        }
        System.out.println();
        StringBuilder b = new StringBuilder();
        for(Point p :points){
            b.append(p).append(' ');
        }
        System.out.println(b);
        
//        String s = "";
//        for(Point p : points){
//            s = s + p + ' ';
//        }
//        System.out.println(s);
    }
}
