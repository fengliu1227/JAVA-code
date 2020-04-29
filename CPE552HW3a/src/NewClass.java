/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fengliu
 */
public class NewClass {
    
//    private int i,j;
//    public int[] res(double i, double j) {
//        this.i=i; this.j=j;
//    }
//    public int[] res() {
//        this(0,0);
//    }
//    public String toString(){
//    return "["+i+","+j+"]";
//}
   
    public static int[] twoSum(int[] nums, int target) {
      int[] res = new int[2];
        for(int i=0;i<=3;i++){
            for(int j=1;j<=3;j++){
            if(nums[i]+nums[j]==target){
                res[0] =i;
                res[1]= j;
            }
                }
        }
     return res;
    }

    public static void main(String args[]){
        int[] a = new int[4];
        a[0]=2; a[1]=7; a[2]=11; a[3]=15;
        int b = 9;
        int[] res = twoSum(a,b);
        System.out.println("["+res[0]+","+res[1]+"]");

}
}  