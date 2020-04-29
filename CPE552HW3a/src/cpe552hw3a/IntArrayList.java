/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpe552hw3a;

/**
 *
 * @author fengliu
 */
public class IntArrayList {
    private int[] a;
    private int used;
    public final void grow(){
        int[] old = a;
        a = new int[old.length*2];
        for(int i = 0; i < old.length; i++){
            a[i] = old[i];
        }
    }
    public IntArrayList(){
        a = new int[1];
    }
    public IntArrayList(int initialCapacity){
        a = new int[initialCapacity];
        used = 0;
    }
    public void add(int v){
        if(used >= a.length){
            grow();
        }
        a[used++] = v;
    }
    public String toString(){
        StringBuilder b = new StringBuilder(used * 10);
        for(int i = 0; i < used; i++){
            b.append(i).append(' ');
        }
        return b.toString();
//        String s=""; //bad idea!!!
//        for(int i = 0; i < used; i++){
//            s = s + a[i] + " ";
//        }
//        return s;
    
    }
    public static void main(String args[]){
        long t0 = System.nanoTime();
        IntArrayList a = new IntArrayList(1);
        for(int i = 0; i < 1000 ;i++){
            a.add(i);
        }
        long t1 = System.nanoTime();
        System.out.println(t1-t0);
        System.out.println(a);
    }
}
