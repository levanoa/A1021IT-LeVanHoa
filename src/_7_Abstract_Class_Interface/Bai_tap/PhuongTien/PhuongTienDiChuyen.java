package _7_Abstract_Class_Interface.Bai_tap.PhuongTien;

import org.omg.CORBA.PUBLIC_MEMBER;

public  abstract class PhuongTienDiChuyen {

     protected String tenLoaiPhuongTien;
     protected HangSanXuat hangSanXuat;


    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public void batDau() {
        System.out.println("batdau");
    }
    public void TangToc() {
        System.out.println("tangtoc");
    }
    public void DungLai() {
        System.out.println("DungLAI");
    }
    public abstract double layVanToc();


}
