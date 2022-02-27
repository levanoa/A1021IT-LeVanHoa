package _17_IO_Binary_File_Serialization.Baitap.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListProduct {
    private ArrayList<Product> list;
    public static Scanner scanner = new Scanner(System.in);


    public ListProduct(){
        this.list = new ArrayList<Product>();
    }

    public ListProduct(ArrayList<Product> list) {
        this.list = list;
    }

    public void themSanPham(Product sp){

       this.list.add(sp);
    }
    public void hienThiSanPham() {
        for (Product sp: list) {
            System.out.println(sp);
        }
    }
    public void timKiemSanPham(String sp){
        for(Product product: list) {
            if(product.getTenSanPham().indexOf(String.valueOf(sp)) >=0 ) {
                System.out.println(product);
            }
        }
    }
    public void ghiXuongFile() {
        try {
            FileWriter fw = new FileWriter("text.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Product s : list ) {
                bw.write(s.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
//        try {
//            File file = new File("text.txt");
//            OutputStream os = new FileOutputStream(file);
//            ObjectOutputStream oos =new ObjectOutputStream(os);
//
//            for (Product s : list ) {
//                oos.writeObject(s);
//            }
//
//            oos.flush();
//            oos.close();
//        } catch (Exception e) {
//        }
    }

    public void suaSanPham(int j) {
        int size = list.size();
        for(int i = 0 ; i < size; i ++){
            if(i==j ) {

                System.out.println("nhập mã sản phẩm");
                int maSanPham = scanner.nextInt();
                scanner.nextLine();
                System.out.println("nhập tên sản phẩm");
                String tenSanPham1 = scanner.nextLine();
                System.out.println("nhập hản sản xuất");
                String hanSanXuat = scanner.nextLine();
                System.out.println("nhập giá");
                double gia = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("nhập mô tả");
                String moTa = scanner.nextLine();

                list.get(i).setMaSanPham(maSanPham);
                list.get(i).setTenSanPham(tenSanPham1);
                list.get(i).setHangSanXuat(hanSanXuat);
                list.get(i).setGia(gia);
                list.get(i).setMoTa(moTa);
                break;

            }

        }

    }
     public ArrayList<Product> readFromFile() {
            try {
                FileReader fr = new FileReader("text1.txt");
                BufferedReader br = new BufferedReader(fr);

                String line ="";

                while (true) {
                    line = br.readLine();
                    if(line == null) {
                        break;
                    }
                    String mang[] =  line.split(",");
                    int maSp = Integer.parseInt(mang[0]);
                    String tenSp = mang[1];
                    String hangSx = mang[2];
                    double gia = Double.parseDouble(mang[3] );
                    String moTa = mang[4];
                    list.add(new Product(maSp,tenSp,hangSx,gia,moTa));
//                System.out.println(line);
                }
//            br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return list;


        }

}
