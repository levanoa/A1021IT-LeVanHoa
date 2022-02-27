package ss16_io_text_file.model.repository;

import ss16_io_text_file.model.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
    void saveStudent(Student student);
    void removeStudent(int index);

    Student searchLiner(int codeStudent);

    Student searchBinary(int codeStudent);
}
