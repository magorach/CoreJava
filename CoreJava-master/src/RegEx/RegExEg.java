package RegEx;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExEg {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools",Pattern.CASE_INSENSITIVE);  // defines a pattern
        Matcher matcher = pattern.matcher("Visit to W3Schools");   // used to search for a pattern in a string
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found");
        }else
            System.out.println("Match not found");
    }
}
