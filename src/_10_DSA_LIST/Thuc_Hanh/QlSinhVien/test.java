package _10_DSA_LIST.Thuc_Hanh.QlSinhVien;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int chon = 0;
        do {
            System.out.println("-----Menu-----");
            System.out.println(" Lựa chọn chức năng: ");
            chon = scanner.nextInt();
            scanner.nextLine();
            if(chon == 1) {
                System.out.println("nhập mã sinh viên");String maSinhVien = scanner.nextLine();
                System.out.println("nhập họ và tên");String hoVaTen = scanner.nextLine();
                System.out.println("nhập năm sinh");int namSinh = scanner.nextInt();
                System.out.println("nhập điểm trung bình");float diemTrungBinh = scanner.nextFloat();
                SinhVien sv = new SinhVien(maSinhVien,hoVaTen,namSinh,diemTrungBinh);
                dssv.themSinhVien(sv);

            }else if(chon == 2) {
                dssv.inDanhSach();
            } else if(chon == 3) {
                System.out.println(dssv.kiemTraDanhSach());
            } else if(chon == 4) {
                System.out.println(dssv.layRaSoLuongSinhVien() );
            } else if(chon == 5) {
                dssv.lamRongDanhSach();
            } else if(chon ==6) {
                System.out.println("nhập mã sinh viên");String maSinhVien = scanner.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println(dssv.kiemTraTonTai(sv));
            } else if(chon ==7) {
                System.out.println("nhập mã sinh viên");
                String maSinhVien = scanner.nextLine();
                SinhVien sv1 = new SinhVien(maSinhVien);
                System.out.println(dssv.xoaSinhVien(sv1));

            }
            else if(chon ==8) {
                System.out.println("nhập họ và tên");
                String hoVaTen = scanner.nextLine();
                dssv.timSinhVien(hoVaTen);
            }
            else if(chon ==9) {
                dssv.sapXepSinhVien();
                dssv.inDanhSach();
            }

        }while (chon !=0);
    }
}
