package _15_Exception.Bai_Tap.Kiem_tra_canh_tam_giac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TriangleEdgesCheck check = new TriangleEdgesCheck();

        try {
            System.out.print("Nhap vao canh thu nhat: ");
            int a = scanner.nextInt();
            System.out.print("Nhap vao canh thu hai: ");
            int b = scanner.nextInt();
            System.out.print("Nhap vao canh thu ba: ");
            int c = scanner.nextInt();
            try {
                check.kiemTra(a,b,c);
            } catch (TriangleEdgesCheck ex) {
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("sai khong dung dinh dang");
        }
        scanner.close();
    }
}
