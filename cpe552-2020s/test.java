public class test {

    public int Step_2_Fibo(int num, boolean isIncrement){
        int a = 1;
        int b = 1;
        int temp = 0;
            while (b <= num) {
                if (b == num) {
                    return 0;
                }
                temp = a;
                temp = a + b;
                a = b;
                b = temp;
            }
            if(isIncrement == false) {
                return num - a;
            }
            else{
                return b - num;
            }
    }

    public static void main(String args[]){
        test a = new test();
        System.out.print(a.Step_2_Fibo(15,false));

    }
}

