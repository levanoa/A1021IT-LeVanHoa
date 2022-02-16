package _12_JavaCollectionFramework.Bai_tap.Su_dung_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> danhSachSanPham;

    public ProductManager(){
        this.danhSachSanPham = new ArrayList<Product>();
    }
    public ProductManager(ArrayList<Product> danhSachSanPham){
        this.danhSachSanPham = danhSachSanPham;
    }

    public void themSanPham(Product sp) {
        this.danhSachSanPham.add(sp);
    }
    public boolean xoaSanPham(Product sp) {
        return this.danhSachSanPham.remove(sp);
    }
    public void hienThiSanPham(){
        for(Product product : danhSachSanPham) {
            System.out.println(product);
        }
    }
    public void timSanPham(String ten) {
        for(Product product : danhSachSanPham) {
            if(product.getTenSanPham().indexOf(String.valueOf(ten)) >=0 ) {
                System.out.println(product);
            }
        }
    }
    public void sapXepSanPham() {
        Collections.sort(this.danhSachSanPham, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getIdSanPham() < o2.getIdSanPham()) {
                    return  1;
                } else if (o1.getIdSanPham() > o2.getIdSanPham()) {
                    return -1;
                } else {
                    return 0;
                }

            }
        });
    }


}
