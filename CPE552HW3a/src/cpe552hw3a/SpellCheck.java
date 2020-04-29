package cpe552hw3a;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * @author fengliu
 */
public class SpellCheck {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new FileReader("usen-spelling-dict.txt"));
        Scanner scan2 = new Scanner(new FileReader("treasureisland.txt"));
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
//         Map<String,Integer> map2 = new HashMap<>();
        String word = new String();
        String pattern = "[A-Za-z'-]*";
        Pattern patt = Pattern.compile(pattern);
        Matcher m = patt.matcher(word);
        int numsOfPrint = 0;
        String tempWord = new String();
        int nums = 0;
        for (int i = 0; scan.hasNext(); ++i) {
            map.put(scan.next(), i);
        }
        for (int i = 0; scan2.hasNext(); ++i) {
            word = scan2.next();
            m = patt.matcher(word);
            if (m.matches()) {
                if (word.charAt(0) <= 90 && word.charAt(0) >= 65) {//if the first character is uppercase
                    tempWord = word;
                    boolean tempExist = map.containsKey(tempWord);
                    if (tempExist) {
                        continue;
                    }
                }
                word = word.toLowerCase();
                boolean exist = map.containsKey(word);
                if (!exist) {
                    if (numsOfPrint >= 100) {
                        break;
                    }
                    System.out.println(word);
                    ++numsOfPrint;
                }
            }
        }
    }
}
//https://raw.githubusercontent.com/StevensDeptECE/Dictionaries/master/usen-spelling-dict.txt
// read the file into a HashMap where the key is the word
// the value is the number
// ex. "aa" --> 0
//  "aal" --> 1
// read the file treasureisland.txt from the data directory
/*
            strip all punctuation. Words are capital or lowercase letter
            followed by letters (no digits)
        
            ignore ALLCAPS
        
            for any word that starts with a capital letter
            spell check the word without the capital letter.
        
            Cat --> cat
        
            if that is not a word, search for the capitalized version
            John --> john (not found)
            search HashMap for John (found) ok.
        
            display a count of all the words found spelled incorrectly
            print the first 100 incorrect words
 */
