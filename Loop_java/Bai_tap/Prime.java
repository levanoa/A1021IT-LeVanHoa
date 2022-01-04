package Loop_java.Bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("mời bạn nhập vào số nguyên tố cần in");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int n = 2; n < num; n++) {
                if (num % n != 0) {
                    System.out.println(n);
                }
                count ++;
            }


    }
}
