package _15_Exception.Thuc_Hanh;

import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập vào một số nguyên dương");
        Integer num =0;
        while(true) {
            try {
                num = scanner.nextInt();
                if(num <= 0) {
                    throw new Exception();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("nhập sai ký tự");
            } catch (Exception e){
                System.out.println("nhập số âm");
            }
        }
    }
}
