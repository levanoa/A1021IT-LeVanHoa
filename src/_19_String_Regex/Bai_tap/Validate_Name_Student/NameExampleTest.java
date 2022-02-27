package _19_String_Regex.Bai_tap.Validate_Name_Student;

import _19_String_Regex.Thuc_Hanh.Validate_account.AccountExample;

public class NameExampleTest {
//    private static NameExample accountExample;

    public static final String[] validAccount = new String[] {"C3318G","A4567I"};
    public static final String[] invalidAccount = new String[] {"M0318G","P0323A"};

    public static void main(String args[]) {
        NameExample nameExample = new NameExample();
        for (String account : validAccount) {
            boolean isvalid = nameExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = nameExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
