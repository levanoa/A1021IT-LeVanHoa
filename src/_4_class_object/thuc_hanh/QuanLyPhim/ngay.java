package _4_class_object.thuc_hanh.QuanLyPhim;

public class ngay {
    public int ngay;
    public int thang;
    public int nam;

    public ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "ngay{" +
                "ngay=" + ngay +
                ", thang=" + thang +
                ", nam=" + nam +
                '}';
    }
}
