package ss16_io_text_file.controller;

import ss16_io_text_file.model.service.IStudentService;
import ss16_io_text_file.model.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        IStudentService iStudentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("CHào mừng bạn đến với chương trình quản lí học sinh");
            System.out.println("Mời bạn chọn chức năng thực hiện.");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Tìm kiếm học sinh");
            System.out.println("5. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.display();
                    break;
                case 2:
                    iStudentService.add();
                    break;
                case 3:
                    iStudentService.delete();
                    break;
                case 4:
                    iStudentService.search();
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }
}
