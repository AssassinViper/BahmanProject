package Security;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    public EmailValidation(){

    }


    /**
     * method is used for checking valid email id format.
     *
     * @param email
     * @return boolean true for valid false for invalid
     */
    public boolean isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
