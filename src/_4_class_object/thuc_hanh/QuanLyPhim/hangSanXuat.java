package _4_class_object.thuc_hanh.QuanLyPhim;

public class hangSanXuat {
    public String tenHang;
    private String quocGia;

    public hangSanXuat(String tenHang, String quocGia) {
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "hangSanXuat{" +
                "tenHang='" + tenHang + '\'' +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }
}
