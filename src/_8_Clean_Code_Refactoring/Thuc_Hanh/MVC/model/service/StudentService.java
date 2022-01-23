package ss8_clean_code.mvc.model.service;

import ss8_clean_code.mvc.model.model.Student;
import ss8_clean_code.mvc.model.repository.IStudentRepository;
import ss8_clean_code.mvc.model.repository.StudentRepository;

import java.util.Scanner;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void add() {
        Student[] students = iStudentRepository.addStudent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vị trí cần thêm");
        int y = Integer.parseInt(scanner.nextLine());
        if( y > students.length) {
            System.out.println("KHÔNG THỂ THÊM");
        } else if(y<0){
            System.out.println("KHÔNG THỂ THÊM");
        } else  {
//            for (int i = students.length; i > y; i--) {
//               students[i] = students[i-1];
//            }
            students[y]= new Student(2,"F","1998-01-01",9);

            for (int j = 0; j  <students.length; j++) {
                System.out.println(students[j]);
            }
//            System.out.println("codeStudent");
//            int codeStudent = Integer.parseInt(scanner.nextLine());
//            System.out.println("NAME");
//            String nameStudent = scanner.nextLine();
//            System.out.println("NGÀY, THÁNG NĂM");
//            String dateOfBird = scanner.nextLine();
//            System.out.println("point");
//            int point = Integer.parseInt(scanner.nextLine());
//            Student[] student1 = {codeStudent,nameStudent,dateOfBird,point};
//            iStudentRepository.addStudent(student1);


        }
    }


    @Override
    public void delete() {
         Student[] students = iStudentRepository.deleteStudent();
        Scanner scanner= new Scanner(System.in);
        System.out.println(" mời bạn nhập sinh viên cần xóa");
        int x = Integer.parseInt(scanner.nextLine());
        int i;
        for(i = 0 ; i <students.length; i ++ ) {
            if( i == x) {
                continue;
            } else {
                System.out.println(students[i]);
            }
        }

    }

    @Override
    public void display() {
        Student[] students = iStudentRepository.getAll();

        for (Student student: students) {
            if(student == null) {
                break;
            }
            System.out.println(student);
        }
    }
}
