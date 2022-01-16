package Access_modifier.Thuc_Hanh.StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student = new Student(111," hòa");

        student.display();
    }
}
