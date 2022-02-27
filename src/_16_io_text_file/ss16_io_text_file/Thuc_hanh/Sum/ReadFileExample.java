package _16_io_text_file.ss16_io_text_file.Thuc_hanh.Sum;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class ReadFileExample {

    public void ReadFileText(String filePath) {
        try {
            File file = new File(filePath);

            if(!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        }catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung lỗi");
        }
    }
}
