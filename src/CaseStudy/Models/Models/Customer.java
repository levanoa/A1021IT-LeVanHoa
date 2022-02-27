package CaseStudy.Models.Models;

public class Customer extends Person{
    private int maKhachHang;
    private String loaiKhach;
    private String diaChi;

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String soCmnd, int sdt, String mail, int maKhachHang, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCmnd, sdt, mail);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }



}
