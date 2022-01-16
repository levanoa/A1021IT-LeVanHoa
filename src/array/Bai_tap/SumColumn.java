package array.Bai_tap;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập vào số dòng của mảng: ");
        m = Integer.parseInt(scanner.nextLine());
        System.out.print(" nhập vào số cột của mảng: ");
        n = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" nhập phần tử thứ [" + i + "," + j + "]:");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }

        }
        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println("\n");
        }
        System.out.println("Mời bạn nhập cột cần tính tổng: ");
        int cot = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < m; i++) {
             sum += arr[i][cot];

        }
        System.out.println("tổng của cột thứ " + cot + " là: " + sum );

    }
}
