package _12_JavaCollectionFramework.Bai_tap.Su_dung_ArrayList;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ProductManager dssp = new ProductManager();
        int chon = 0;
        do {
            System.out.println("-----Menu-----");
            System.out.println(" Lựa chọn chức năng: ");
            System.out.println(
                    "1.	Thêm sản phẩm vào danh sách.\n"
                            + "2.	Xóa sản phẩm đang có.\n"
                            + "3.	In danh sách sản phẩm ra màn hình \n"
                            + "4.	Tìm sản phẩm.\n"
                            + "5.	Sắp xếp sản phẩm.");
            chon = scanner.nextInt();
            scanner.nextLine();
            if(chon == 1) {
                System.out.println("nhập mã sản phẩm");Integer idSaPham = scanner.nextInt();
                scanner.nextLine();
                System.out.println("nhập tên sản phẩm");String tenSanPham = scanner.nextLine();
                System.out.println("nhập thông tin sản phẩm");String thongTin = scanner.nextLine();

                Product sp = new Product(idSaPham,tenSanPham,thongTin);
                dssp.themSanPham(sp);

            }else if(chon == 2) {
                System.out.println("nhập id sản phầm cần xóa");
                Integer idSanPham = scanner.nextInt();
                Product sp = new Product(idSanPham);
                System.out.println("xóa sản phẩm : " + dssp.xoaSanPham(sp));
            } else if(chon == 3) {
                dssp.hienThiSanPham();
            } else if(chon == 4) {
                System.out.println("nhập ten san pham");
                String tenSanPham = scanner.nextLine();
                dssp.timSanPham(tenSanPham);
            } else if(chon ==5) {
                dssp.sapXepSanPham();
                dssp.hienThiSanPham();
            }

        }while (chon !=0);
    }
}
