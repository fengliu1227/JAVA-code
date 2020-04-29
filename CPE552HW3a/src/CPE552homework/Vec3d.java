package CPE552homework;

import cpe552hw3a.*;

/**
 * @author fengliu
 */
public class Vec3d {
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
