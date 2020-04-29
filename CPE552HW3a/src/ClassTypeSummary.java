/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fengliu
 */
public class ClassTypeSummary {
    public static void main(String args[]){
        A a1 = //ILLEAGAL: NEW A();
        a1.f();
    }
}

interface a{
    void f(); //this is abstract EVEN THOUGH IT DOESN'T SAY SO!!!
}

abstract class B{
    private int x;
    public B(){x = 0;}
    public abstract void f();
    public void g(){System.out.println("g");}
    
}

class C{ // can be instantiated (can create an object using new c())
}

class D<T>{
}


