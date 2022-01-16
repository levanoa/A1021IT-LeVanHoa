package array.Bai_tap;

import java.util.Scanner;

public class FindMaxArray {
    public static void main(String[] args) {
        int m, n;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập vào số dòng của mảng: ");
        m = Integer.parseInt(scanner.nextLine());
        System.out.print(" nhập vào số cột của mảng: ");
        n = Integer.parseInt(scanner.nextLine());
        int [][] arr = new int[m][n];

        for( int  i = 0 ; i < m ; i ++) {
            for(int j = 0; j < n ; j++) {
                System.out.println(" nhập phần tử thứ [" + i + "," +  j +"]:");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }

        }
        System.out.println("Mảng vừa nhập:");
        for( int  i = 0 ; i < m ; i ++) {
            for(int j = 0; j < n ; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println("\n");
        }
        int max = arr[0][0];
        for( int  i = 0 ; i < m ; i ++) {
            for(int j = 0; j < n ; j++) {
                if(arr[i][j] >= max) {
                    max = arr[i][j];
                }
            }

        }
        System.out.println(" phần tử lớn nhất là : " + max);



    }
}
