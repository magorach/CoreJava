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

        for (String pwd : passwords) {
            Matcher m = p.matcher(pwd);
            if (m.matches()) {
                System.out.println(pwd + " ✅ Strong password");
            } else {
                System.out.println(pwd + " ❌ Weak password");
            }
        }

    }
}
