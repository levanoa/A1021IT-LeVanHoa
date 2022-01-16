package introduction_java.thuc_hanh;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        double a;
        double b;
        System.out.println(" GIẢI PT BẬT NHẤT CÓ DẠNG: 'ax +b = 0' ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        a = scanner.nextFloat();

        System.out.println("Nhập vào b: ");
        b =scanner.nextFloat();

        if ( a !=0) {
            double x = - b/a;
            System.out.println("Phương trình có nghiệm duy nhất là: "+ x);
        } else {
            if( b==0 ) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");

            }

        }



    }
}
