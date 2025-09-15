package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {

        String[] passwords = {
                "abc123",           // ❌ too short, missing uppercase & special char
                "Password1",        // ❌ missing special char
                "Password@1",       // ✅ valid
                "weakpass@123",     // ❌ missing uppercase
                "Strong@123"        // ✅ valid
        };
        //Explanation of Regex
        //
        //^ → start of string
        //
        //(?=.*[a-z]) → must contain at least one lowercase letter
        //
        //(?=.*[A-Z]) → must contain at least one uppercase letter
        //
        //(?=.*\\d) → must contain at least one digit
        //
        //(?=.*[@$!%*?&]) → must contain at least one special character
        //
        //.{8,} → at least 8 characters long
        //
        //$ → end of string

        //Regex with lookaheads
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$";
        Pattern p = Pattern.compile(regex);

        //. → matches any single character
        //
        //* → means zero or more times
        //
        //Together: .* = “any characters, of any length (including none)”
        //
        //    .*[a-z] → checks if somewhere there’s a lowercase letter.
        //
        //    .*[A-Z] → checks if somewhere there’s an uppercase letter.
        //
        //    Same for digits and special chars.
        //Without .*, your password would only pass if the first character was lowercase, the second uppercase, the third digit, and so on — which is not what we want.

        for (String pwd : passwords) {
            Matcher m = p.matcher(pwd);
            if (m.matches()) {
                System.out.println(pwd + " ✅ Strong password");
            } else {
                System.out.println(pwd + " ❌ Weak password");
            }
        }

        // //source -->   https://medium.com/stackera/java-regex-part-9-look-ahead-f999f6d0d7b1

    }
}
