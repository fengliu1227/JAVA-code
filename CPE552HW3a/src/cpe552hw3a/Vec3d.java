package cpe552hw3a;
/**
 * @author fengliu
 */
public class Vec3d {
   private double x,y,z;
            
    public Vec3d(double xi, double yi, double zi) {
        x = xi; y = yi; z = zi;
    }
    public Vec3d() {
        this(0,0,0);
    }
    public String toString(){
        return x+","+y+","+z;
    }
    public static Vec3d add(Vec3d a, Vec3d b) {
        return new Vec3d(a.x+b.x,a.y+b.y,a.z+b.z); //TODO:
    }
    public static Vec3d sub(Vec3d a, Vec3d b) {
        return new Vec3d(a.x-b.x,a.y-b.y,a.z-b.z); //TODO:
    }
    public static double dot(Vec3d a, Vec3d b) {
        return a.x*b.x+a.y*b.y+a.z*b.z; //TODO:
    }
    public static Vec3d cross(Vec3d a, Vec3d b) {
        return new Vec3d(a.y*b.z-b.y*a.z,a.z*b.x-b.z*a.x,a.x*b.y-b.x*a.y);
    }

    // set the x,y,z components of the vector to these new values
    public void set(double x, double y, double z) {
    }
    public static void main(String[] args) {
        Vec3d v1 = new Vec3d();
        System.out.println(v1); // (0,0,0)
        Vec3d v2 = new Vec3d(1,2,3);
        System.out.println(v2); // (1,2,3)
        Vec3d v3 = new Vec3d(4,1,-1);
        System.out.println(add(v2,v3)); // (5,3,2)
        System.out.println(sub(v2,v3)); // (-3,1,4)
        System.out.println(dot(v2,v3)); 
        System.out.println(cross(v2,v3));// Vec3d=(2*-1-3*1,3*4-1*-1,1*1-2*4)=(-5,13,-7)
    }
}
