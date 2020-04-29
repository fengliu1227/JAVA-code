import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * @author fengliu
 */
public class MyParser {
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<String> name = new ArrayList<>();
    public void getName(String i) throws FileNotFoundException {
        Scanner s1 = new Scanner(new FileReader(i));
        String word = new String();
        String pattern = "[A-Za-z0-9]*";
        Pattern patt = Pattern.compile(pattern);
        Matcher m = patt.matcher(word);
        while(s1.hasNext()){
            word = s1.next();
            list.add(word);

        }
        for(int j = 0; j < list.size(); ++j){
            if(list.get(j).equals("class")){
                if(list.get(j+2).equals("extends")){
                    name.add(list.get(j+1));
                    name.add(list.get(j+3));
                }
                else{
                    name.add(list.get(j+1));
                    name.add("object");
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        args = new String[]{"test.java", "Grapher.java"};
        if(args.length == 0){
            System.out.println("The input may have some problem, please try again!");
        }
        MyParser a = new MyParser();
        for(String i : args){
            a.getName(i);
        }
        for(int i = 0; i < name.size(); ++i){
            if(i % 2 == 0) {
                System.out.println("Class Name: "+ name.get(i));
            }
            else{
                System.out.println("Parent: "+ name.get(i));
            }
        }

    }
}