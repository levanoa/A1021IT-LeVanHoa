package _5_Access_modifier.Thuc_Hanh.StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String collge = "BBDIT";

    Student (int r, String n) {
        rollno =r;
        name = n;
    }
    static void change(){
        collge = " CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + collge);
    }
}
