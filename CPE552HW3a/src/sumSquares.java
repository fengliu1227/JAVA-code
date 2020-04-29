/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fengliu
 */
public class sumSquares {
//    private int b = 0;
//    public sumSquares(int n){
//        for(;n>0;n--){
//            b += (int) Math.pow(n,2); 
//        }
//    }
//    public String toString(){
//      return b+"";
//    }

    public static void main(String args[]){
       int n =2;
       double b = 0;
       for(;n>0;n--){
            b += Math.pow(n,2);
     }      
        System.out.println(b);
    
}
}