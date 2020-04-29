import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import net.sf.json.*;
/**
 *
 * @author fengliu
 */
public class SolarSystem {

    static ArrayList<Body> list = new ArrayList<>();

    public SolarSystem() {
        try {
            Scanner s = new Scanner(new FileReader("solarsystem.dat"));
            for (int i = 0; i < 15; i++) {
                if (i == 0) {
                    String name = s.next();
                    String orbits = s.next();
                    String mass = s.next();
                    String diam = s.next();
                    String perihelion = s.next();
                    String aphelion = s.next();
                    String orbperiod = s.next();
                    String rotationalperiod = s.next();
                    String axiatilt = s.next();
                    String orbinclin = s.next();
                } else {
                    Body a = new Body();
                    a.setName(s.next());
                    String orbits = s.next();
                    a.setMass(Double.parseDouble(s.next()));
                    String diam = s.next();
                    String perihelion = s.next();
                    String aphelion = s.next();
                    String orbperiod = s.next();
                    String rotationalperiod = s.next();
                    String axiatilt = s.next();
                    String orbinclin = s.next();
                    list.add(a);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        list.get(0).setPosition(new Vec3d(0, 0, 0));

        for (int i = 1; i < 14; ++i) {
            list.get(i).setPosition(new Vec3d(Math.random()*((3000-1000+1)+3000),Math.random()*((3000-1000+1)+3000), 0));
            list.get(i).setPosition(new Vec3d(Math.random()*((3000-1000+1)+3000),Math.random()*((3000-1000+1)+3000), 0));
        }
        for (int i = 0; i < 14; ++i) {
            for (int j = 0; j < 14; ++j) {
                if (list.get(i) != (list.get(j))) {
                    list.get(i).AddAcceleration(list.get(j));
                }
            }
        }
    }
    public void writeObject(PrintWriter p) {
        for(int i = 0; i < 14; ++i){
            JSONObject temp =JSONObject.fromObject(list.get(i));
            System.out.println(temp.toString());
            p.println(temp.toString());
        }
        p.close();
        System.out.println("The file is sucessfully written, The file name is \"HWjavaBean.txt\"");
    }

    public static void main(String[] args) throws FileNotFoundException {
        SolarSystem homework = new SolarSystem();
        PrintWriter p = new PrintWriter("HWjavaBean.txt");
        homework.writeObject(p);
//        for(Body b: list){
//            b.GetPrint(b);
//        }

    }
}

