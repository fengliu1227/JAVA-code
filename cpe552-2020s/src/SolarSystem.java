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

class Body {

    private String name;
    private String orbit;
    private double mass;
    private double orbDistance;
    private double diam;
    private double perihelion;
    private double aphelion;
    private double orbperiod;
    private double rotationalperiod;
    private double axiatilt;
    private double orbinclin;


    private Vec3d x = new Vec3d(0, 0, 0); //position of the body in 3-space
    private Vec3d v = new Vec3d(0, 0, 0);; // velocity
    private Vec3d a = new Vec3d(0, 0, 0);; // acceleration

    public Body() {
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getOrbDistance() {
        return orbDistance;
    }

    public void setOrbDistance(double orbDistance) {
        this.orbDistance = orbDistance;
    }

    public double getDiam() {
        return diam;
    }

    public void setDiam(double diam) {
        this.diam = diam;
    }

    public double getPerihelion() {
        return perihelion;
    }

    public void setPerihelion(double perihelion) {
        this.perihelion = perihelion;
    }

    public double getAphelion() {
        return aphelion;
    }

    public void setAphelion(double aphelion) {
        this.aphelion = aphelion;
    }

    public double getOrbperiod() {
        return orbperiod;
    }

    public void setOrbperiod(double orbperiod) {
        this.orbperiod = orbperiod;
    }

    public double getRotationalperiod() {
        return rotationalperiod;
    }

    public void setRotationalperiod(double rotationalperiod) {
        this.rotationalperiod = rotationalperiod;
    }

    public double getAxiatilt() {
        return axiatilt;
    }

    public void setAxiatilt(double axiatilt) {
        this.axiatilt = axiatilt;
    }

    public double getOrbinclin() {
        return orbinclin;
    }

    public void setOrbinclin(double orbinclin) {
        this.orbinclin = orbinclin;
    }

    public Vec3d getX() {
        return x;
    }

    public void setX(Vec3d x) {
        this.x = x;
    }

    public Vec3d getV() {
        return v;
    }

    public void setV(Vec3d v) {
        this.v = v;
    }

    public Vec3d getA() {
        return a;
    }

    public void setA(Vec3d a) {
        this.a = a;
    }

    public void setAddAcceleration(Body b) {
        Vec3d dis = Vec3d.sub(b.x, this.x);
        double Distance = Math.sqrt(Math.pow(dis.x, 2)+Math.pow(dis.y, 2)+Math.pow(dis.z, 2));
        Vec3d directOfVec = new Vec3d(dis.x/Distance, dis.y/Distance, dis.z/Distance);
        double Acceleration = (6.67e-10*b.mass)/Math.pow(Distance, 2);
        Vec3d newA = new Vec3d(directOfVec.x*Acceleration,directOfVec.y*Acceleration,directOfVec.z*Acceleration);
        this.a = a.add(a, newA);
    }

    public void GetPrint(Body a){
        System.out.println(a.getName() + a.a);
    }

}

class Vec3d {
    public double x,y,z;

    public Vec3d(double xi, double yi, double zi) {
        x = xi; y = yi; z = zi;
    }
    public Vec3d() {
        this(0,0,0);
    }
    public Vec3d add(Vec3d a, Vec3d b) {
        return new Vec3d(a.x+b.x,a.y+b.y,a.z+b.z); //TODO:
    }
    public static Vec3d sub(Vec3d a, Vec3d b) {
        return new Vec3d(a.x-b.x,a.y-b.y,a.z-b.z); //TODO:
    }
    public static double dot(Vec3d a, Vec3d b) {
        double result_dot = a.x*b.x + a.y*b.y + a.z*b.z;
        return result_dot; //TODO:
    }

    public static Vec3d cross(Vec3d a, Vec3d b) {
        return new Vec3d((a.y*b.z-a.z*b.y),(a.z*b.x-a.x*b.z),(a.x*b.y-a.y*b.x));
    }
    public String toString(){
        return("["+x+","+y+","+z+"]");
    }
    public void set(double set_x, double set_y, double set_z){
        x = set_x;
        y = set_y;
        z = set_z;
    }
}
