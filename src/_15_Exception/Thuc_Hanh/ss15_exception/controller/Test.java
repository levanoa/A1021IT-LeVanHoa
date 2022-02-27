package ss15_exception.controller;

import ss15_exception.model.model.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    Student student;
    public static void main(String[] args) {
        System.out.println("Mời bạn nhập vào 1 số dương: ");
        Scanner scanner = new Scanner(System.in);
            int num = Integer.parseInt(scanner.nextLine());
        int[] arr = {1,3,4};
        System.out.println(arr[2]);
       Test test = new Test();
        System.out.println(test.student.getNameStudent());
        try {
            test.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter("E:\\test.txt");
        File file = new File("E:\\test.txt");
    }

}
