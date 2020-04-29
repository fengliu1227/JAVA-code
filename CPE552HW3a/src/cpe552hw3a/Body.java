package cpe552hw3a;
/**
 * @author fengliu
 */
public class Body {
    private String name;
    private double mass;
    private double orbDistance;
    private double vel;
    private Vec3d x; //position of the body in 3-space
    private Vec3d v; // velocity
    private Vec3d a; // acceleration
            
//    public Body(String name, double mass, double orbDistance, double vel) {
//        x = new Vec3d(); // pick a random spot at the correct orbital distance
//        v = new Vec3d();
//        a = new Vec3d();        
//    }
    public Body(){
    }
    
//    public void zerAcceleration() {
//        a.set(0,0,0);
//    }
//    public void addAcceleration(Body b) {
//        double F = 6.67e-10* this.mass * b.mass/b.orbDistance;
//        double pow = Math.pow(a.x-b.x.x,2)+Math.pow(a.y-b.x.y,2)+Math.pow(a.z-b.x.z,2);
//        this.a.x = F * (a.x-b.x.x)/pow;
//        this.a.y = F * (a.y-b.x.y)/pow;
//        this.a.z = F * (a.z-b.x.z)/pow;
//        // add the acceleration due to b to a
//    }
    public String toString(){
        return x.toString()+"\t"+v.toString();
    }
    
    
//    public static void main(String[] args) {
//        
//        double earthmass = 5.97e24;
//        double earthOrbitalDistance = 160e9; // meters from sun
//        double earthVel = 0.11e9; // Find this!!
//        double moonMass = 0.073e24; //TODO
//        double moonOrbitalDistance = (0.363e9+0.406e9)/2; // TODO
//        double moonVel = 0.00368e9;//TODO
//        // start earth and moon at the random places in circular orbits
//        Body earth = new Body("Earth", earthmass, earthOrbitalDistance, earthVel);
//        Body moon = new Body("Moon", moonMass, moonOrbitalDistance, moonVel);
//        System.out.println(earth); // print out position, velocity
//        System.out.println(moon);
//        //earth.zerAcceleration();
//        //earth.addAcceleration(moon);
//    }
}
