package array.Thuc_hanh;

import java.util.Scanner;

public class Find_array {
    public static void main(String[] args) {
       String [] students = {"lehoa", "vanhung"} ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập tên sv vần tìm: " );
        String input_name = scanner.nextLine();
        boolean checkName = false;
        for ( int i = 0 ; i < students.length; i ++) {
            if( students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                checkName = true;
                break;
            }
        }
        if (!checkName) {
            System.out.println("Not found "+ input_name + " in the array");
        }
    }
}
