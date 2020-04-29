import session06.Body;
import CPE552_2020s.Body;
import processing.core.*;
import java.util.*;
/**
 *
 * @author dkruger
 */

class Body {
    //private PShape sphere
    // load the texture and attach to sphere
    private PShape sphere;
    private String name;
    private String fileName;
    private float radius;


    public Body(PApplet p, String name, String fileName, float radius) {
        p.noStroke();
        PImage img = p.loadImage(fileName);
        //this.sphere = p.createShape(radius);
        sphere = p.createShape(PConstants.SPHERE, radius);
        sphere.setTexture(img);
        this.name = name;
        this.radius = radius;
        this.fileName = fileName;
//        this.img = loadImage(fileName);
//        this.sphere = createShape(SPHERE,this.radius);
//        this.sphere.setTexture(img);
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
        Body b1 = new Body(this, "Earth", "earth.jpg", 400);
//        Body b2 = new Body("Moon", "moon.jpg", 100);
        list.add(b1);
//        list.add(b2)
    }

    public void draw() {
        background(0);
        //rect(0,0, 10,10);
        list.get(0).draw(this);
//         translate so they don't draw on top of each other!!!
//        translate(58, 48, 0);
//        list.get(1).draw(this);
    }
    public static void main(String[] args) {
        PApplet.main("MyApplet");

    }
}