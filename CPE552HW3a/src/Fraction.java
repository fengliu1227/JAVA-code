/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fengliu
 */
public class Fraction {
    private int num, den;
    public Fraction(int n,int d){
        num = n;  den = d;
    }
   public String toString(){
       return num+"/"+den;
   }
   public Fraction add(Fraction a){
       return new Fraction(num*a.den+a.num*den,den*a.den);
   }
   public static Fraction add(Fraction a, Fraction b){
       return new Fraction(a.num*b.den+b.num*a.den, a.den*b.den);
   }
   public static void main(String[] args){
//       Fraction a = new Fraction(1,2);
//       Fraction b = new Fraction(2,3);
//       Fraction c = add(a,b);
//       System.out.println(a.add(b));
//       System.out.println(c);
final int m = 4;

final int n = 3;

int multTable[][] = new int[ m ][ n ];

for (int i =  1;i <= m; i++){
  for (int j = 1; j  <= n ;j++){
      multTable[ i-1 ][ j-1 ]= i*j;
      System.out.print(multTable[ i-1 ][ j-1 ]);
  }
  System.out.println();
}
double[] b= {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

int [][] c ={{1,2,3},{2,3,1},{3,1,2}};

boolean[] e = new boolean[ 1024 ];

   }
   public class A{

  public int max(int[] a){

  int maxVal = 0;

  for (int i = 1; i < a.length; i++)
     if (maxVal >a[i] ){
       maxVal =  a[i];

     }
  return maxVal;
 }

}
}
