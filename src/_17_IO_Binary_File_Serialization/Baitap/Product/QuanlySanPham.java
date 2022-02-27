package _17_IO_Binary_File_Serialization.Baitap.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanlySanPham {


    public static void main(String[] args) {

        Product sp1  = new Product(002," BỘT GIẶC","THÁI LAN",30000,"CHẤT TẨY RỬA");
        Product sp2  = new Product(003," NƯỚC RỬA CHÉN","THÁI LAN",40000,"CHẤT TẨY RỬA");
        Product sp3  = new Product(003," DẦU GỘI","VIỆT NAM",40000,"CHẤT TẨY RỬA");

        List<Product> ds = new ArrayList<>();

        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
//        ListProduct listProduct1 = new ListProduct();


        ListProduct listProduct = new ListProduct();

        Scanner scanner = new Scanner(System.in);

        int chon = 5;
        do {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println(" Mời bạn lựa chọn chức năng ");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Lưu danh sách sinh viên xuống tập tin");
            System.out.println("5. Đọc danh sách lên tập tin");
            System.out.println("6. Nhập sản phẩm sửa");
            System.out.println("7. Thoát ");
            System.out.println("--------------------------------------------------------------------------------");
            chon = scanner.nextInt();
            if (chon == 1) {
                    System.out.println("nhập mã sản phẩm");
                    int maSanPham = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập tên sản phẩm");
                    String tenSanPham = scanner.nextLine();
                    System.out.println("nhập hản sản xuất");
                    String hanSanXuat = scanner.nextLine();
                    System.out.println("nhập giá");
                    double gia = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("nhập mô tả");
                    String moTa = scanner.nextLine();

                    Product sp = new Product(maSanPham, tenSanPham, hanSanXuat, gia, moTa);
                    listProduct.themSanPham(sp);

            } else if (chon == 2) {
                listProduct.hienThiSanPham();
            } else if (chon == 3) {
                System.out.println("mời bạn nhập tên sản phẩm cần tìm");
                scanner.nextLine();
                String tenSanPham = scanner.nextLine();
                listProduct.timKiemSanPham(tenSanPham);
            }else if (chon == 4) {
               listProduct.ghiXuongFile();
            } else if(chon == 5) {
                System.out.println("mời bạn chọn tập tin cần đọc");
                listProduct.readFromFile();

            }
            else if(chon ==6) {
                System.out.println("nhập id cần sửa");
                scanner.nextLine();
                int j = scanner.nextInt();
//                Product sp1 = new Product(tenSanPham1);
                listProduct.suaSanPham(j);
            }

        } while (chon != 7);
    }

    private static String getSanPham1(String sanPham1) {
        return sanPham1;
    }
}
