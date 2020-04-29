import java.util.ArrayList;

public class Question1 {
    public static void main(String args[]){
        final int N = 10000;
        ArrayList<Integer> nums = new ArrayList();
        for(int i = 1; i <= N; ++i){
            nums.add(i);
        }
        int result = 0;
        for (int i = 0; i < N; ++i){
            result += nums.get(i);
        }
        System.out.println(result);
    }
}
