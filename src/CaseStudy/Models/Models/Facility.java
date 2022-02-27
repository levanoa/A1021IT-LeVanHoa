package CaseStudy.Models.Models;

public abstract class Facility {

    private String tenDichVu;
    private double dienTich;
    private double chiPhiThue;
    private int soNguoiSuDung;
    private String kieuThue;

    public Facility(String tenDichVu, double dienTich, double chiPhiThue, int soNguoiSuDung, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiSuDung = soNguoiSuDung;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoNguoiSuDung() {
        return soNguoiSuDung;
    }

    public void setSoNguoiSuDung(int soNguoiSuDung) {
        this.soNguoiSuDung = soNguoiSuDung;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", dienTich=" + dienTich +
                ", chiPhiThue=" + chiPhiThue +
                ", soNguoiSuDung=" + soNguoiSuDung +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
