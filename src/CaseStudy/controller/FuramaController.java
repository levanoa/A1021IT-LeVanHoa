package CaseStudy.controller;

import _10_DSA_LIST.Thuc_Hanh.QlSinhVien.DanhSachSinhVien;
import _10_DSA_LIST.Thuc_Hanh.QlSinhVien.SinhVien;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int chon = 6;
        do {
            System.out.println("-----Menu-----");
            System.out.println(" Lựa chọn chức năng: ");
            System.out.println("1.\tEmployee Management ");
            System.out.println("2.\tCustomer Management ");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management ");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            System.out.println("---------------------------------------------");
            chon = scanner.nextInt();
            scanner.nextLine();
            if(chon == 1) {
                System.out.println(" Lựa chọn chức năng: ");
                System.out.println("1.Display list employees");
                System.out.println("2.Add new employee");
                System.out.println("3.Edit employee");
                System.out.println("4.Return main menu");
                System.out.println("---------------------------------------------");
                int chon1 = 4;
                chon1 = scanner.nextInt();
                do{


                } while (chon1 !=4);

            }else if(chon == 2) {
                System.out.println(" Lựa chọn chức năng: ");
                System.out.println("1.Display list customers");
                System.out.println("2.Add new customer");
                System.out.println("3.Edit customer");
                System.out.println("4.Return main menu");
                System.out.println("---------------------------------------------");
                int chon2 = 4;
                chon2 = scanner.nextInt();
                do {


                } while (chon2 !=4);
            }else if(chon == 3) {
                System.out.println(" Lựa chọn chức năng: ");
                System.out.println("1.Display list facility");
                System.out.println("2.Add new facility");
                System.out.println("3.Display list facility maintenance");
                System.out.println("4.Return main menu");
                System.out.println("---------------------------------------------");
                int chon3 = 4;
                chon3 = scanner.nextInt();
                do {


                } while (chon3 !=4);
            } else if(chon == 4) {
                System.out.println(" Lựa chọn chức năng: ");
                System.out.println("1.Add new booking");
                System.out.println("2.Display list booking");
                System.out.println("3.Create new constracts");
                System.out.println("4.Display list contracts");
                System.out.println("5.Edit contracts");
                System.out.println("6.Return main menu");
                System.out.println("---------------------------------------------");
                int chon4 = 6;
                chon4 = scanner.nextInt();
                do {


                } while (chon4 !=6);
            } else if(chon == 5) {
                System.out.println(" Lựa chọn chức năng: ");
                System.out.println("1.Display list customers use service");
                System.out.println("2.Display list customers get voucher");
                System.out.println("3.Return main menu");
                System.out.println("---------------------------------------------");
                int chon5 = 3;
                chon5 = scanner.nextInt();
                do {


                } while (chon5 !=3);
            }


        }while (chon !=6);

    }
}
