package _16_io_text_file.ss16_io_text_file.Thuc_hanh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Write_read {
    public Write_read() {
    }

    public void writeToFile(List<Student> list) {
        try {
            FileWriter fw = new FileWriter("text.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student s : list ) {
                bw.write(s.toString());
                bw.newLine();
            }
//            bw.write(s1.toString()); // GHI DỮ LIỆU 1 ĐỐI TƯỢNG
            bw.close();
            fw.close();
        } catch (Exception e) {

        }
    }
//    public List<Student> readFromFile() {
//        List<Student> list = new ArrayList<>();
//        try {
//            FileReader fr = new FileReader("text.txt");
//            BufferedReader br = new BufferedReader(fr);
//
//            String line ="";
//
//            while (true) {
//                line = br.readLine();
//                if(line == null) {
//                    break;
//                }
//                String mang[] =  line.split(",");
//                int age = Integer.parseInt(mang[0]);
//                String name = mang[1];
//                double mark = Double.parseDouble(mang[2]);
//                list.add(new Student(age,name,mark));
////                System.out.println(line);
//            }
////            br.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//
//
//    }


}
