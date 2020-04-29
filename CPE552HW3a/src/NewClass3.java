
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fengliu
 */
public class NewClass3 {
//与string搭配
////    private String str;
////    private String str2;
//    public void func(String str, String str2) {
////        this.str = str;
////    this.str2 =str2;
//    str += " hello";
//    str2 += "a";   
//}
//-------------------------------------------------------------
//与Integer搭配
    private Integer str;
    private Integer str2;
    public void func(Integer str, Integer str2) {
    str += 1;
    str2 += 2;
    this.str = str;
    this.str2 =str2;
}
//-------------------------------------------------------------

    public static void main(String[] args) {
//        int[] a = new int[2];
//        a[0] = 1;
//        a[1] = a[0];
//        a[0] = 2;
//        int[] b = a;
//        b[0] = 4;
//        for(int i = 0; i < a.length; ++i){
//            System.out.println(a[i]);
//        }
//        for(int j : b){
//            System.out.println(j);
//        }
//-------------------------------------------------------------
//        Integer a = new Integer(40);
//        Integer b = new Integer(40);
//        Integer c = new Integer(0);
//        System.out.println("a==b?" + (a == b));
//        System.out.println("a==b+c?" + (a == (b + c)));
//-------------------------------------------------------------
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(2);
//        list.addAll(list2);
//        list2.addAll(1, list);
//        for (Integer a : list) {
//            System.out.print(a);
//        }
//        System.out.println();
//        for (Integer a : list2) {
//            System.out.print(a);
//        }
//        System.out.println();
//        System.out.print(list2.clone());
//        System.out.println();
//        list.clear();
//        for (Integer a : list) {
//            System.out.print("empty" + a);
//        }
//        System.out.println();
//        for (Integer a : list2) {
//            System.out.print(a);
//        }
//-------------------------------------------------------------
//String部分
//NewClass3 a= new NewClass3();
//
//String str = new String(); str= "Hi";
//String str2 = new String(); str2="bcd";
//a.func(str, str2);
//System.out.print(str + ", " + str2);
//-------------------------------------------------------------
NewClass3 a= new NewClass3();

a.str = 100; 
a.str2 = 200; 
a.func(a.str, a.str2);
System.out.print(a.str + ", " + a.str2);
//-------------------------------------------------------------
//        String b = "abc";
//        System.out.println("a==b?"+(a==b));
//        System.out.println(a.equals(b));
//        String c = "ab"+"c";
//        System.out.println("a==c?"+(a==c));
//        System.out.println(a.equals(c));
//        String d = "ab";
//        d = d + "c";
//        System.out.println("a==d?"+(a==d));
//        System.out.println(a.equals(d));
//        String e = new String("abc");
//        System.out.println("a==e?"+(a==e));
//        System.out.println(a.equals(e));
//-------------------------------------------------------------
    }
}
