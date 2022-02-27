package _17_IO_Binary_File_Serialization.Baitap.Product;

public class Product {
  private  int maSanPham;
  private String tenSanPham;
  private String HangSanXuat;
  private double gia;
  private String moTa;


  public Product(String tenSanPham) {
    this.tenSanPham = tenSanPham;
  }

  public Product(int maSanPham, String tenSanPham, String hangSanXuat, double gia, String moTa) {
    this.maSanPham = maSanPham;
    this.tenSanPham = tenSanPham;
    this.HangSanXuat = hangSanXuat;
    this.gia = gia;
    this.moTa = moTa;
  }

  public int getMaSanPham() {
    return maSanPham;
  }

  public void setMaSanPham(int maSanPham) {
    this.maSanPham = maSanPham;
  }

  public String getTenSanPham() {
    return tenSanPham;
  }

  public void setTenSanPham(String tenSanPham) {
    this.tenSanPham = tenSanPham;
  }

  public String getHangSanXuat() {
    return HangSanXuat;
  }

  public void setHangSanXuat(String hangSanXuat) {
    HangSanXuat = hangSanXuat;
  }

  public double getGia() {
    return gia;
  }

  public void setGia(double gia) {
    this.gia = gia;
  }

  public String getMoTa() {
    return moTa;
  }

  public void setMoTa(String moTa) {
    this.moTa = moTa;
  }

  @Override
  public String toString() {
    return "Product{" +
            "maSanPham=" + maSanPham +
            ", tenSanPham='" + tenSanPham + '\'' +
            ", HangSanXuat='" + HangSanXuat + '\'' +
            ", gia=" + gia +
            ", moTa='" + moTa + '\'' +
            '}';
  }
}
