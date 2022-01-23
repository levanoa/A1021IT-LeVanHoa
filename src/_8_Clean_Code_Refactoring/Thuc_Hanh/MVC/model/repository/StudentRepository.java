package ss8_clean_code.mvc.model.repository;

import ss8_clean_code.mvc.model.model.Student;

public class StudentRepository implements IStudentRepository {
    private static Student[] students = new Student[10];

    static {
        students[0] = new Student(1,"A","1998-01-01",9);
        students[1] = new Student(2,"B","1998-01-01",9);
        students[2] = new Student(3,"C","1998-01-01",9);
    }

    @Override
    public Student[] getAll() {
        return students;
    }
    @Override
    public Student[] deleteStudent() {
        return students;
    }
    @Override
    public Student[] addStudent() {
        return students;
    }
//    @Override
//    public void addStudent(Student student) {
//            for( int i= 0 ; i< students.length; i++){
//                if( students[i] == null) {
//                    students[i] = student;
//                    break;
//                }
//
//            }
////        for (Student student: students) {
////            if(student == null) {
////                break;
////            }
////            System.out.println(student);
////        }
//
//
//    }





}
