package cpe552hw3a;

import java.io.FileReader;
import java.util.Scanner;
/**
 * @author fengliu
 */
public class OpenFile {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("solarsystem.dat"));
            while (s.hasNext()) {
//                int v = s.nextInt();
//                double v2 = s.nextDouble();
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
                System.out.println(name+"\t"+orbits+"\t"+mass+"\t"+diam+"\t"+perihelion+"\t"+aphelion+"\t"+orbperiod+"\t"+rotationalperiod+"\t"+axiatilt+"\t"+orbinclin);
            
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
