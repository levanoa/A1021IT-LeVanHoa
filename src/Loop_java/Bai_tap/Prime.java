package Loop_java.Bai_tap;

import java.util.Scanner;

public class Prime {
    public static boolean checkNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.println("Tất cả 20  số nguyên tố đầu tiên là: ");
        int count = 0;
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (checkNumber(i)) {
                count ++;
                System.out.print(" " + i);
            }
            if ( count > 18) {
                break;
            }
        }


    }


}