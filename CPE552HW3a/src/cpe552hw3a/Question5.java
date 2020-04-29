import java.io.FileReader;
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        try {
            Scanner s = new Scanner(new FileReader("Question5.dat"));
            while (s.hasNext()) {
                String name = s.next();
                int nums = Integer.parseInt(s.next());
                map.put(name, nums);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        Iterator i = map.entrySet().iterator();
        int sum = 0;
        while(i.hasNext()){
            HashMap.Entry pair = (HashMap.Entry)i.next();
            System.out.println(pair.getKey() + "  " + pair.getValue());
            sum += Integer.parseInt(pair.getValue().toString());
            i.remove();
        }
        System.out.println(sum);
    }
}
