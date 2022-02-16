package _4_class_object.Bai_tap.CompareTo;

public class SinhVien implements Comparable<SinhVien> {
    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private int diemTrungBinh;

    public SinhVien(int maSinhVien, String hoVaTen, String tenLop, int diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(int diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

     public String getTen() {
        String s = this.hoVaTen.trim();
        if(s.indexOf(" ")>=0){
           int vt =  s.lastIndexOf(" ");
           return s.substring(vt +1);
        } else {
            return s;
        }
     }
    @Override
    public int compareTo(SinhVien o) {
        String tenThis = this.getTen();
        String tenO = o.getTen();

        return tenThis.compareTo(tenO);
    }

//    @Override
//    public int compareTo(SinhVien o) {
//
//        return this.diemTrungBinh - o.diemTrungBinh;
//    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien=" + maSinhVien +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", tenLop='" + tenLop + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }
}
