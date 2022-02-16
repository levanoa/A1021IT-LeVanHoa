package _3_array.Thuc_hanh;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        String[] mang1 = { "lehoa","hoavl"};

        String[] mang1_a = mang1;
        mang1_a[0] = " hh";

        System.out.println(Arrays.toString(mang1_a));
        System.out.println(Arrays.toString(mang1));

        String[] mang1_c = mang1.clone();
        mang1_c[0] = "aa";

        System.out.println(Arrays.toString(mang1_c));

    }
}
