/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fengliu
 */
abstract class Shape {
    private double x,y;
    public Shape(double x, double y){
        this.x = x; this.y = y;
    }
    abstract double area();
    abstract void draw();
    public static void main(String args[]){
    
    }
}
class Circles extends Shape{
    private double radius;
    public Circles(double x, double y, double z){
        radius = r;
    }
}
// must write area and draw
class Rect extends Shape{
}

class Line extends Shape{
}
