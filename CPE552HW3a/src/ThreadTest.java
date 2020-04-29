/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fengliu
 */
public class ThreadTest {

    public static void main(String args[]) {
        String str1 = "aac";
        String str2 = "a";
        String str3;
        str1 = str1.replaceFirst(str2, "");
        str3 = str1.replaceAll(str2,"");
        System.out.println(str1);
        System.out.println(str3);
        Thread a = new SumEven(3,9);
        a.start();
        Thread b = new SumEven(10,15);
        b.start();
    }
}

class SumEven extends Thread {

    private int a, b;

    public SumEven(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public  void run() {
        int result = 0;
        if (a % 2 == 0) {
            for(int i = a + 2; i < b; i += 2){
//                result += i;//print the sum of all evens between a and b
        System.out.println(i);//print all evens between a and b
            }
        }
        else{
            for(int i = a + 1; i < b; i += 2){
//                result += i;//print the sum of all evens between a and b
        System.out.println(i);//print all evens between a and b
            }
        }
//        System.out.println(result);//print the sum of all evens between a and b
    }
}
