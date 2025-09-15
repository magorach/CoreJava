package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {

       // n+ -> Matches any string that contains at least one or more
//        Pattern p = Pattern.compile("a+");
//        Matcher m = p.matcher("caaaat");
//        System.out.println(m.find()); // true (because "aaa" matches)

        
        
        // n* -> Matches any string that contains zero or more occurrences of n
//        Pattern p = Pattern.compile("a*");
//        Matcher m = p.matcher("");
//        while (m.find()) {
//            System.out.println("'" + m.group() + "'");
//        }

        //  n? ->  Matches any string that contains zero or one occurrences of n
//        Pattern p = Pattern.compile("a?");
//        Matcher m = p.matcher("caaat");
//        while (m.find()) {
//            System.out.println("'" + m.group() + "'");
//        }


        //Interview question - built in trim v/s by regex ---> remove white spaces

        String input = "  Hello World  ";

        //by built in
        String trimmed1 =input.trim();


        // by regex
        Pattern  p = Pattern.compile("^\\s* | \\s$*");
        Matcher m = p.matcher(input);
        String trimmed2 = m.replaceAll("");
        System.out.println(trimmed1);
        System.out.println(trimmed2);





    }
}
