package CPE552homework;

import cpe552hw3a.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

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
                    a.setOrbit(s.next());
                    a.setMass(Double.parseDouble(s.next()));
                    a.setDiam(Double.parseDouble(s.next()));
                    a.setPerihelion(Double.parseDouble(s.next()));
                    a.setAphelion(Double.parseDouble(s.next()));
                    a.setOrbperiod(Double.parseDouble(s.next()));
                    a.setRotationalperiod(Double.parseDouble(s.next()));
                    a.setAxiatilt(Double.parseDouble(s.next()));
                    a.setOrbinclin(Double.parseDouble(s.next()));
                    list.add(a);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        list.get(0).setX(new Vec3d(0, 0, 0));

        for (int i = 1; i < 14; ++i) {
            list.get(i).setX(new Vec3d(Math.random(), Math.random(), 0));
        }
        for (int i = 0; i < 14; ++i) {
            for (int j = 0; j < 14; ++j) {
                if (list.get(i) != (list.get(j))) {
                    list.get(i).setAddAcceleration(list.get(j));
                }
            }
        }
    }

    public static void main(String[] args) {
        SolarSystem homework = new SolarSystem();
        for(Body b: list){
            b.GetPrint(b);
        }

    }
}
