/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fengliu
 */
class A {
  private int x;
  public A() { x = 0; }
  public int getX() { return x; }
}

public class B extends A {
  private int z;
  public B(int x, int z) {
      x=getX();
      this.z = z;
      
  }
}