package RegEx;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    public static void main(String[] args)  {

        // Example of n{x,y}
        //{1,3} works internally:It tries to take minimum 1 digit, then expands up to 3 digits (greedy), but stops if the next character doesn’t match the rule.
        //matcher.find() method that iterates across the string, scanning for the next match each time.
        //group(0) = full match
        //
        //group(1) = first ( … )
        //
        //group(2) = second ( … )


        String input = "+1-800-1234567, +91-22-7654321, +123-456-9876543";

        // Pattern for country code (1 to 3 digits) and area code (2-4 digits)
        Pattern pattern = Pattern.compile("\\+(\\d{1,3})-(\\d{2,4})-\\d+");
        Matcher m = pattern.matcher(input);

        while (m.find()){
            String countryCode =m.group(1);
            String areaCOde = m.group(2);
            System.out.println("Country Code:" + countryCode + ", Area Code:" + areaCOde);
        }

    }
}
