package _19_String_Regex.Bai_tap.Validate_PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String NUMBER_REGEX = "^\\(\\d{2}\\)-\\d{10}";

    public PhoneNumber() {
    }


    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
