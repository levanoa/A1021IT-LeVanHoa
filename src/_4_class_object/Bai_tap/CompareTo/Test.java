package _4_class_object.Bai_tap.CompareTo;

import java.util.Arrays;
import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {
        SinhVien sv1 =new SinhVien(100,"Lê Ban","lớp1",9);
        SinhVien sv2 =new SinhVien(150,"Lê An","lớp1",9);
        SinhVien sv3 =new SinhVien(120,"Lê Cn","lớp1",9);
        SinhVien sv5 =new SinhVien(120,"Lê BUNH","lớp1",9);

//        System.out.println(sv1.compareTo(sv2));
        SinhVien [] sv = new SinhVien[]{sv1,sv2,sv3};
        System.out.println(Arrays.toString(sv));
        Arrays.sort(sv);
        System.out.println(Arrays.toString(sv));
        System.out.println(Arrays.binarySearch(sv,sv3));

        System.out.println(Arrays.binarySearch(sv,sv5));

//        System.out.println(Arrays.toString(sv));

    }
}
