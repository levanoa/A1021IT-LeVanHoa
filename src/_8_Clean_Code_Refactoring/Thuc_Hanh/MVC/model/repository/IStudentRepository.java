package ss8_clean_code.mvc.model.repository;

import ss8_clean_code.mvc.model.model.Student;

public interface IStudentRepository {
    Student[] getAll();
    Student[] deleteStudent();
    Student[] addStudent();
//    public void addStudent(Student student);

}
