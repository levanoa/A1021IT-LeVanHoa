package ss15_exception.model.repository;

import ss15_exception.model.model.Student;

import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    //    <Student>: generic -> chúng ta sẽ tìm hiểu vào thứ 2
    private static List<Student> students = new LinkedList<>();

    static {
        students.add(new Student(1, "HaiTT", "1998-01-01", 9));
        students.add(new Student(2, "TrungDP", "1998-01-01", 9));
        students.add(new Student(3, "TrungDC", "1998-01-01", 9));
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void saveStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int index) {
        students.remove(index);
    }

    @Override
    public Student searchLiner(int codeStudent) {
        for (Student student : students) {
            if (student.getCodeStudent() == codeStudent) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchBinary(int codeStudent) {
        //1,2,4,6,7,9,11
        int mid;
        int left = 0;
        int right = students.size() - 1;
        while (right >= left) {
            mid = (left + right) / 2;
            if (codeStudent == students.get(mid).getCodeStudent()) {
                return students.get(mid);
            } else if (codeStudent > students.get(mid).getCodeStudent()) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
