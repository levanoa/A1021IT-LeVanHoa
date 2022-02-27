package ss15_exception.model.repository;

import ss15_exception.model.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
    void saveStudent(Student student);
    void removeStudent(int index);
    Student searchLiner(int codeStudent);
    Student searchBinary(int codeStudent);
}
