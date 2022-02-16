package _7_Abstract_Class_Interface.Bai_tap.PhuongTien;

public class MayBay extends PhuongTienDiChuyen {

    private String loaiNhienLieu;

    public MayBay( HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("máy bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 5000;
    }
    public void catCanh(){
        System.out.println("cat canh");
    }
    public void haCanh(){
        System.out.println("ha Canh");
    }
}
