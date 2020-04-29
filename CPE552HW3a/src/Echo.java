/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fengliu
 */
//public class NewClass1TestDrive {
//    public static void main(String args[]){
//         NewClass a = new NewClass();
//         NewClass b = new NewClass();
//         int x = 0;
//         while(x<4){
//             a.hello();
//             a.count = a.count + 1;
//             if(x == 3){
//                 b.count += 1;
//             }
//             if(x > 0){
//                 b.count += a.count;
//             }
//             x +=1;
//         }
//         System.out.println(b.count);
//    }
//    
//}

class Echo{
      int count =0;
      void hello(){
         System.out.println("hello...");
      }
      
      
         public static void main(String args[]){
         Echo a = new Echo();
         Echo b = new Echo();
         int x = 0;
         while(x<4){
             a.hello();
             a.count = a.count + 1;
             if(x == 4){
                 b.count += 1;
             }
             if(x < 5 ){
                 b.count += a.count;
             }
             x +=1;
         }
         System.out.println(b.count);
    }
}
