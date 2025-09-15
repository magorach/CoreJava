package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCharacters {
    public static void main(String[] args) {


        // | --> OR  (Matches either one of the options)
//        Pattern p = Pattern.compile("cat|dog");
//        Matcher m = p.matcher("I have a dog");
//        System.out.println(m.find()); // true (found "dog")



        // . --> Any character
        // c.t = "c", then any character, then "t"
        //Matches "cat", "cot", "c1t".
//        Pattern p = Pattern.compile("c.t");
//        Matcher m = p.matcher("I saw a cat");
//        System.out.println(m.find()); // true ("cat" matches c.t)



        //  ^ → Start of string
        //Only matches if text starts with "Hello".)

//        Pattern p = Pattern.compile("^Hello");
//        Matcher m = p.matcher("Hello world");
//        System.out.println(m.find()); // true


        // $ → End of string

//        Pattern p = Pattern.compile("world$");
//        Matcher m = p.matcher("Hello world");
//        System.out.println(m.find()); // true



        // \\d -> to find a digit (0-9) ---( \d matches only one digit, it prints them separately.)
//        Pattern p = Pattern.compile("\\d");
//        Matcher m = p.matcher("I am 25 years old");
//        while (m.find()) {
//            System.out.println(m.group());
//        }


        // \\d+ -> to find a digit (0-9) ---( \d+ matches the whole number (25)
//        Pattern p = Pattern.compile("\\d+");
//        Matcher m = p.matcher("I am 25 years old and my brother is 30");
//        while (m.find()) {
//            System.out.println(m.group());
//        }


        // \\s -> to find a whitespace character(space " ", \t tab, \n new line)
        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher("Hello   World\tJava\nRegex");
        while (m.find()) {
            System.out.println("Found whitespace: '" + m.group() + "'");
        }


        // \\b --> matches only exact word (word boundary)
//        Pattern p = Pattern.compile("\\bcat\\b");
//        Matcher m = p.matcher("I like cat but not category");
//        System.out.println(m.find()); // true (matches "cat", not "category")



        // \\u -> Find the Unicode character specified by the hexadecimal number xxxx
        // regex is literally looking for the character 'A' and Apple starts with A

//        Pattern p = Pattern.compile("\\u0041"); // Unicode for 'A' -- 0041 - 65
//        Matcher m = p.matcher("Apple");
//        System.out.println(m.find());
//        System.out.println(p.matcher("apple").find());   // false









    }

}
