package _4_class_object.thuc_hanh.QuanLyPhim;

public class thongTin {
    private String tenPhim;
    private int namSanXuat;
    private hangSanXuat hangSx;
    public double giaVe;
    private ngay ngayChieu;

    public thongTin(String tenPhim, int namSanXuat, hangSanXuat hangSx, double giaVe, ngay ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSx = hangSx;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public hangSanXuat getHangSx() {
        return hangSx;
    }

    public void setHangSx(hangSanXuat hangSx) {
        this.hangSx = hangSx;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public ngay getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    @Override
    public String toString() {
        return "thongTin{" +
                "tenPhim='" + tenPhim + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", hangSx=" + hangSx +
                ", giaVe=" + giaVe +
                ", ngayChieu=" + ngayChieu +
                '}';
    }
    public boolean kiemTra (thongTin phimkhac) {
//        if(this.giaVe < phimkhac.giaVe) {
//            return true;
//        }else {
//            r
        return this.giaVe < phimkhac.giaVe;
    }
    public double giaSauKhiKhuyenMai (double phanTram) {
        return this.giaVe * (1-phanTram/100);

    }
}
