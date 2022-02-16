package _7_Abstract_Class_Interface.Bai_tap.PhuongTien;

public class XeOto extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public XeOto (String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("xe o to",hangSanXuat);
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
        return 200;
    }
}
