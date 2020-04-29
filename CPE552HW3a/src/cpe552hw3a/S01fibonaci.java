package cpe552hw3a;

/**
 *
 * @author fengliu
 */
public class S01fibonaci {
 //1,1,2,3,5,8.....
    public static int fibo(int n){
       int a = 1, b = 1, c = 0;
       if (n <=2)
          return 1;
       for (int i = 3; i < n; i++){
          c = a + b;
          a = b;
          b = c;
       }
       return c;
    }
}
