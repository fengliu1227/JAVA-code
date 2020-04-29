import processing.core.*;
import java.awt.*;
import java.util.*;
import java.io.FileReader;
import static processing.core.PConstants.P3D;
/**
 * @author fengliu
 */
class ReadFile {
    public static HashMap<String,Body> map = new HashMap<>();
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("solarsystem.dat"));
            while (s.hasNext()) {

                String name = s.next();
                String orbits = s.next();
                String Image = s.next();
                String mass = s.next();
                String diam = s.next();
                String peri = s.next();
                String aphelion = s.next();
                String orbP = s.next();
                String rotP = s.next();
                String axia = s.next();
                String orbin = s.next();
                map.put(name, new Body(name,orbits, Image, mass, diam, peri, aphelion, orbP, rotP, axia, orbin));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class Body extends PApplet{

    private PShape sphere;
    private PApplet p;
    private String name;
    public String orbits, Image, mass, diam, peri, aphelion, orbP, rotP, axia, orbin;
    

    public Body(String name,String orbits, String Image, String mass, String diam, String peri, String aphelion, String orbP, String rotP, String axia, String orbin) {
        p.noStroke();
        this.name = name;
        this.orbits = orbits;
        this.Image = Image;
        this.mass = mass;
        this.diam = diam;
        this.peri = peri;
        this.aphelion = aphelion;
        this.orbP = orbP;
        this.rotP = rotP;
        this.axia = axia;
        this.orbin = orbin;
        this.sphere = p.createShape(1,Float.parseFloat(diam));
        PImage img = p.loadImage(Image);
        sphere = p.createShape(PConstants.SPHERE, Float.parseFloat(diam));
        sphere.setTexture(img);

    }


    public void draw(PApplet p) {
        p.shape(sphere);
    }
}
public class MyApplet extends PApplet {

    public void setup() {
        size(1000,1000, P3D);
        ReadFile a = new ReadFile();
    }

    public void draw() {
        background(0);
        ReadFile.map.get("Earth").draw();
        translate(Float.parseFloat(ReadFile.map.get("Moon").diam)/2 * cos(30), Float.parseFloat(ReadFile.map.get("Moon").diam)/2 * cos(30), 0);
        ReadFile.map.get("Moon").draw();
        translate((Float.parseFloat(ReadFile.map.get("Sun").diam)/2 +Float.parseFloat(ReadFile.map.get("Moon").diam)/2) * cos(30)  * cos(30), 0, 0);
        ReadFile.map.get("Sun").draw();
        translate((Float.parseFloat(ReadFile.map.get("Sun").diam)/2 +Float.parseFloat(ReadFile.map.get("Moon").diam)/2+Float.parseFloat(ReadFile.map.get("Venus").diam)/2) * cos(30)  * cos(30), 0, 0);
        ReadFile.map.get("Venus").draw();

        
    }
    public static void main(String[] args) {
        PApplet.main("MyApplet");

    }
}
