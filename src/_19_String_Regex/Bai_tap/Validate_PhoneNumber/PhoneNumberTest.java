package _19_String_Regex.Bai_tap.Validate_PhoneNumber;

import _19_String_Regex.Bai_tap.Validate_Name_Student.NameExample;

public class PhoneNumberTest {

    public static final String[] validAccount = new String[] {"(84)-0935686069"};
    public static final String[] invalidAccount = new String[] {"(f8)-12345678"};

    public static void main(String args[]) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String account : validAccount) {
            boolean isvalid = phoneNumber.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = phoneNumber.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
