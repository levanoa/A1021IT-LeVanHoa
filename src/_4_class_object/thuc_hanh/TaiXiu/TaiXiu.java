package _4_class_object.thuc_hanh.TaiXiu;

import javax.jws.soap.SOAPBinding;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoan = 5000000;
        Scanner scanner = new Scanner(System.in);
        int chon = 1;
        do {
            System.out.println("----------- MỜI BẠN CHỌN----------");
            System.out.println("chọn 1 để tiếp tục chơi");
            System.out.println("chọn phím bất kỳ để thoát");
            Locale lc = new Locale("vi","VN");
            NumberFormat numf = NumberFormat.getInstance(lc);
            chon = scanner.nextInt();
            if(chon ==1) {
                System.out.println("*** BẮT ĐẦU CHƠI ***");
                System.out.println("****** Tài khoản của bạn " + numf.format(taiKhoan ) + " bạn muốn cược bao nhiêu");
                double datCuoc = 0;
                do {
                    System.out.println(" đặt lớn hơn 0 và nhỏ hơn số tiền đang có");
                    datCuoc = scanner.nextDouble();
                } while (datCuoc <=0 || datCuoc> taiKhoan);

                int luaChonTaiXiu = 0;
                do{
                    System.out.println(" chọn 1 Tài Hoặc 2 lÀ xỉu");
                    luaChonTaiXiu = scanner.nextInt();
                }while (luaChonTaiXiu !=1 && luaChonTaiXiu !=2);

                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();

                int giaTri1 = xucXac1.nextInt(5)+1;
                int giaTri2 = xucXac2.nextInt(5)+1;
                int giaTri3 = xucXac3.nextInt(5)+1;
                int tong = giaTri1+giaTri2+giaTri3;
                System.out.println(" Kế quả: " + giaTri1 + " + " + giaTri2 + " + " + giaTri3 + " = " + tong);
                if( tong <=10) {
                    System.out.println(" TÀI");
                }else {
                    System.out.println("XỈU");
                }
                if( tong == 3 || tong == 18) {
                    taiKhoan -=datCuoc;
                    System.out.println("******Tổng là: " + tong + " nhà cái ăn hết");
                    System.out.println("Tài khoản của bạn là " + numf.format(taiKhoan ));

                } else if (tong >=4 && tong <=10) {
                    if(luaChonTaiXiu == 2) {
                        System.out.println("BẠN ĐÃ THẮNG");
                        taiKhoan +=datCuoc;
                        System.out.println("Tài khoản của bạn là " + numf.format(taiKhoan ));

                    }else {
                        System.out.println("BẠN ĐÃ THUA");
                        taiKhoan -=datCuoc;
                        System.out.println("Tài khoản của bạn là " + numf.format(taiKhoan ));
                    }


                }else {
                    if(luaChonTaiXiu == 1) {
                        System.out.println("BẠN ĐÃ THẮNG");
                        taiKhoan +=datCuoc;
                        System.out.println("Tài khoản của bạn là " + numf.format(taiKhoan ));

                    }else {
                        System.out.println("BẠN ĐÃ THUA");
                        taiKhoan -=datCuoc;
                        System.out.println("Tài khoản của bạn là " + numf.format(taiKhoan ));
                    }

                }


            }


        }while (chon ==1);
    }

}
