package _17_IO_Binary_File_Serialization.Baitap.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

    public static void main(String[] args) throws Exception {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("text.txt");
            out = new FileOutputStream("text1.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if(in !=null){
                in.close();
            }
            if(out != null) {
                out.close();
            }
        }
    }

}
