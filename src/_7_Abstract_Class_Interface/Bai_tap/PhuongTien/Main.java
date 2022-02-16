package _7_Abstract_Class_Interface.Bai_tap.PhuongTien;

public class Main {
    public static void main(String[] args) {
        HangSanXuat hang1 = new HangSanXuat("hang 1","viet nam");
        HangSanXuat hang2 = new HangSanXuat("hang 2","viet nam");
        HangSanXuat hang3 = new HangSanXuat("hang 3","viet nam");

        PhuongTienDiChuyen maybay = new MayBay(hang1,"dau");
        PhuongTienDiChuyen xeoto = new XeOto("dau",hang1);
        PhuongTienDiChuyen xedap = new XeDap(hang3);



        System.out.println("HANG SAN XUAT");
        System.out.println("maybay" + maybay.layTenHangSanXuat());

        System.out.println(" lấy vận tốc");

        System.out.println(maybay.layVanToc());
        System.out.println(xedap.layVanToc());
        System.out.println(xeoto.layVanToc());

        xedap.batDau();
        xedap.DungLai();
        xedap.TangToc();
    }

}
