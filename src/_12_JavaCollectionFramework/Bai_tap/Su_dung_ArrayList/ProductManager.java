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
//    public void suaSanPham(Integer id) {
//        boolean isExisted = false;
//        int size = danhSachSanPham.size();
//        for (int i = 0; i < size; i++)
//            if (danhSachSanPham.get(i).getIdSanPham()) {
//                isExisted = true;
//                danhSachSanPham.get(i).setIdSanPham();
//                danhSachSanPham.get(i).setTenSanPham();
//                danhSachSanPham.get(i).setThongTinSanPham();
//                break;
//            }
//        if (!isExisted) {
//            System.out.printf("id = %d not existed.\n", id);
//        } else {
//            return hienThiSanPham();
//        }
//    }
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
