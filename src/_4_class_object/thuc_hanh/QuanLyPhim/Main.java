package _4_class_object.thuc_hanh.QuanLyPhim;

public class Main {
    public static void main(String[] args) {
        ngay ngay1 = new ngay(10,11,1995);
        ngay ngay2 = new ngay(12,11,1995);

        hangSanXuat hang1 =new hangSanXuat("colombia","vietNam");
        hangSanXuat hang2 =new hangSanXuat("colombia2","sing");

        thongTin phim1 = new thongTin("anh huNG",1995, hang1, 100000,ngay1);
        thongTin phim2 = new thongTin("anh hung xa dieu",1996, hang1, 200000,ngay2);

        System.out.println(phim1.toString());

        System.out.println( phim1.kiemTra(phim2) );

        System.out.println(hang1.getTenHang());
        System.out.println(phim1.giaSauKhiKhuyenMai(10));




    }
}
