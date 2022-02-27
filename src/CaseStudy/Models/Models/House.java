package CaseStudy.Models.Models;

public class House extends Facility{
    private String tieuChuanPhong;
    private int soTang;

    public House(String tenDichVu, double dienTich, double chiPhiThue, int soNguoiSuDung, String kieuThue, String tieuChuanPhong, int soTang) {
        super(tenDichVu, dienTich, chiPhiThue, soNguoiSuDung, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}
