package CPE552homework;

import cpe552hw3a.*;

/**
 * @author fengliu
 */
public class Body {

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
        System.out.println(a.getName() + a.x+a.v+a.a);
    }

}
