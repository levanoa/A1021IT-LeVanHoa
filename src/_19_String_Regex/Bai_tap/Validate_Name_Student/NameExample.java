package _19_String_Regex.Bai_tap.Validate_Name_Student;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameExample {

    private static final String NAME_REGEX = "^[ABC]{1}[0-9]{4}[G-M]{1}$";

    public NameExample() {
    }


    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
