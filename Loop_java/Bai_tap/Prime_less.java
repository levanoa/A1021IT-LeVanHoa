package Loop_java.Bai_tap;

import java.util.Scanner;

public class Prime_less {
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
        System.out.println("Tất cả số số nguyên tố nhỏ hơn 100 là: ");
        int n = 100;
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (checkNumber(i)) {
                System.out.print(" " + i);
            }
        }

    }
}
