package array.Bai_tap;

import java.util.Scanner;

public class Tong_MatranCheo {
    public static void main(String[] args) {
        int m ;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập vào số dòng và cột của mảng: ");
        m = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(" nhập phần tử thứ [" + i + "," + j + "]:");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }

        }
        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += arr[i][j];
                    System.out.println("Phần tử:" + arr[i][j]);
                }
            }
        }
        System.out.println("Tổng của đường chéo chính trong ma trận là: " + sum );



    }
}
