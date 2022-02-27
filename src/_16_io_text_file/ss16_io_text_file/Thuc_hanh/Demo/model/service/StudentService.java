package ss16_io_text_file.model.service;

import ss16_io_text_file.model.model.Student;
import ss16_io_text_file.model.repository.IStudentRepository;
import ss16_io_text_file.model.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {

        int codeStudent =0;
        while(true) {
            try {
                System.out.print("Mời bạn nhập code student: ");
                codeStudent = Integer.parseInt(scanner.nextLine());
                if(codeStudent <0) {
                    throw new Exception();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập sai định dạng");
            } catch (Exception e) {
                System.out.println("Bạn nhập số âm.");
            } finally {
                System.out.println("OK");
            }
        }
        System.out.print("Mời bạn nhập tên của học sinh: ");
        String name = scanner.nextLine();
        System.out.print(" Mời bạn nhập ngày tháng năm sinh: ");
        String date = scanner.nextLine();
        System.out.print("Mời bạn nhập điểm: ");
        double point = Double.parseDouble(scanner.nextLine());
        Student student = new Student(codeStudent, name, date, point);
        iStudentRepository.saveStudent(student);
    }

    @Override
    public void delete() {
        System.out.print("Mời bạn nhập mã code: ");
        int code = Integer.parseInt(scanner.nextLine());
        List<Student> students = iStudentRepository.getAll();
        for (int i = 0; i < students.size(); i++) {
            if (code == students.get(i).getCodeStudent()) {
                iStudentRepository.removeStudent(i);
                break;
            }
        }
    }

    /* @author: haiTT
    @param: không có
    @return: không có
   hàm n
     */
    @Override
    public void display() {
        List<Student> students = iStudentRepository.getAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //search liner
//    @Override
//    public void search() {
//        System.out.print("Mời bạn nhập codeStudent cần tìm: ");
//        int codeStudent = Integer.parseInt(scanner.nextLine());
//        Student student = iStudentRepository.searchLiner(codeStudent);
//        if(student == null) {
//            System.out.println("Không tìm thấy đối tượng");
//        } else {
//            System.out.println(student);
//        }
//    }

    //search binary
    @Override
    public void search() {
        System.out.print("Mời bạn nhập codeStudent cần tìm: ");
        int codeStudent = Integer.parseInt(scanner.nextLine());
        Student student = iStudentRepository.searchBinary(codeStudent);
        if(student == null) {
            System.out.println("Không tìm thấy đối tượng");
        } else {
            System.out.println(student);
        }
    }
}
