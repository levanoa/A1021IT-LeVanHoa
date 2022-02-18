package _12_JavaCollectionFramework.Bai_tap.Su_dung_ArrayList;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private Integer idSanPham;
    private String tenSanPham;
    private String thongTinSanPham;

    public Product(Integer idSanPham) {
        this.idSanPham = idSanPham;
    }

    public Product(Integer idSanPham, String tenSanPham, String thongTinSanPham) {
        this.tenSanPham = tenSanPham;
        this.idSanPham = idSanPham;
        this.thongTinSanPham = thongTinSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(Integer idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getThongTinSanPham() {
        return thongTinSanPham;
    }

    public void setThongTinSanPham(String thongTinSanPham) {
        this.thongTinSanPham = thongTinSanPham;
    }

    @Override
    public String toString() {
        return "Product{" +
                "tenSanPham='" + tenSanPham + '\'' +
                ", idSanPham=" + idSanPham +
                ", thongTinSanPham='" + thongTinSanPham + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.idSanPham.compareTo(o.idSanPham);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getIdSanPham(), product.getIdSanPham());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSanPham());
    }
}
