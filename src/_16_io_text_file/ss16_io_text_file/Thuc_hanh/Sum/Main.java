package _16_io_text_file.ss16_io_text_file.Thuc_hanh.Sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("nhập đương dẫn file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.ReadFileText(path);
    }
}
