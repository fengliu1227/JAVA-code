import processing.core.*;
import java.awt.*;
import java.util.*;
import java.io.FileReader;
/**
 * @author fengliu
 */
public class ReadFile {
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

class Body {
    //private PShape sphere
    // load the texture and attach to sphere
    private PShape sphere;
    private String name;
    private String fileName;
    private float radius;


    public Body(PApplet p, String name, String fileName, float radius) {
        p.noStroke();
        this.sphere = p.createShape(1,radius);
        this.name = name;
        this.radius = radius;
        this.fileName = fileName;
        PImage img = p.loadImage(fileName);
        sphere = p.createShape(PConstants.SPHERE, radius);
        sphere.setTexture(img);

    }


    public void draw(PApplet p) {

        p.shape(sphere);
    }
}
public class MyApplet extends PApplet {
    // your solar system should contain a list of bodies
    private ArrayList<Body> list = new ArrayList<>();
    public void settings() {
        size(1000,1000, P3D);
    }

    public void setup() {
        size(1000,1000, P3D);
        Body b1 = new Body(this, "Earth", "earth.jpg", 400);
        Body b2 = new Body(this, "Moon", "moon.jpg", 100);
        list.add(b1);
        list.add(b2);
    }

    public void draw() {
        background(0);
        list.get(0).draw(this);
//         translate so they don't draw on top of each other!!!
        translate(58, 48, 0);
        list.get(1).draw(this);
    }
    public static void main(String[] args) {
        PApplet.main("MyApplet");

    }
}
