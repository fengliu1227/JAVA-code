/*
 Author : Feng Liu (HW4a_Strings)
 */
public class Strings {
    private String a;
    public Strings(String a){
        this.a = a;
    }

    public static String removeVowels(Strings a){
        String result = "";
        for(int i = 0; i < a.a.length(); ++i){
            if(a.a.charAt(i) == 'a' || a.a.charAt(i) == 'e' || a.a.charAt(i) == 'i' || a.a.charAt(i) == 'o' || a.a.charAt(i) == 'u'){
                continue;
            }
            else{
                result += a.a.charAt(i);
            }
        }
        return result;
    }

    public static String reverse(Strings a){
        String result = "";
        for(int i = a.a.length() - 1; i >=0 ; --i){
            result += a.a.charAt(i);
        }
        return result;
    }

    public static String replace(Strings a, char r1, char r2){
        String result = "";
        for(int i = 0; i < a.a.length(); ++i){
            if(a.a.charAt(i) == r1){
                result += r2;
            }
            else{
                result += a.a.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Strings s = new Strings("This is a testTesting");
        System.out.println(removeVowels(s));//ths s  tstTstng
        System.out.println(reverse(s));//gnitseTtset a si siht
        System.out.println(replace(s, 'i', 'x')); //thxs xs a testTestxng
    }
}