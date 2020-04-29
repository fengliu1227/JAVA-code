package sak;

import java.lang.reflect.Method;
import java.util.regex.*;
/**
 *
 * @author Feng Liu
 */
public class Reflection {
     public static void main(String[] args) throws Exception {
        String className = "session10.PersonBean";
        Class c = Class.forName(className);
        String name = c.getName();
        Method[] methods = c.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println("---------GET------");
//        Pattern getter = Pattern.compile("^get");
        for (Method m : methods) {
          String methodName = m.getName();
          if (methodName.matches("get")) {
              System.out.println(methodName);
          }
        }
    }
}