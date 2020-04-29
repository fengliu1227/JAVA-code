import net.sf.json.JSONObject;

public class Body {

    private String name;
    private double mass;



    private Vec3d position = new Vec3d(0, 0, 0); //position of the body in 3-space
    private Vec3d velocity = new Vec3d(0, 0, 0);; // velocity
    private Vec3d a = new Vec3d(0, 0, 0);; // acceleration

    public Body() {
    }




    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }


    public Vec3d getPosition() {
        return position;
    }

    public void setPosition(Vec3d x) {
        this.position = x;
    }

    public Vec3d getVelocity() {
        return velocity;
    }

    public void setVelocity(Vec3d v) {
        this.velocity = v;
    }
    public void AddAcceleration(Body b) {
        Vec3d dis = Vec3d.sub(b.position, this.position);
        double Distance = Math.sqrt(Math.pow(dis.x, 2)+Math.pow(dis.y, 2)+Math.pow(dis.z, 2));
        Vec3d directOfVec = new Vec3d(dis.x/Distance, dis.y/Distance, dis.z/Distance);
        double Acceleration = (6.67e-10*b.mass)/Math.pow(Distance, 2);
        Vec3d newA = new Vec3d(directOfVec.x*Acceleration,directOfVec.y*Acceleration,directOfVec.z*Acceleration);
        this.a = a.add(a, newA);
        Vec3d temp = new Vec3d(-a.x,-a.y,a.z);
        setVelocity(temp);
    }
}
