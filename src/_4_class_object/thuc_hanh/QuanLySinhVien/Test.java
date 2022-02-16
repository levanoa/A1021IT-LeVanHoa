package _4_class_object.thuc_hanh.QuanLySinhVien;

import _4_class_object.thuc_hanh.QuanLyPhim.ngay;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(10,11,1995);
        Ngay ngay2 = new Ngay(10,12,1995);

        Lop lop1 = new Lop("thống kê", "CNTT");
        Lop lop2 = new Lop("TIN HỌC", "KE TOAN");

        SinhVien sinhVien1 = new SinhVien("001", "LE VAN HOA",ngay1, 6, lop1);
        SinhVien sinhVien2 = new SinhVien("002", "LE HUNG",ngay2, 3, lop2);

        System.out.println(sinhVien1.layTenKhoa());
        System.out.println(sinhVien1.kiemTraThiDat());
        System.out.println(sinhVien1.kiemTraSinhVien(sinhVien2));

    }
}
