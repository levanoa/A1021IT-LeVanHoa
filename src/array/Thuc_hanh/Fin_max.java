package array.Thuc_hanh;

import java.util.Scanner;

public class Fin_max {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(" ENTER SIZE: ");
            size = scanner.nextInt();
            if( size >20) {
                System.out.println("Enter again: ");
            }
        } while (size> 20);
        arr = new int[size];
        for ( int i = 0; i <  arr.length; i ++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();

        }
        System.out.print("MANG VUA NHAP LA: " );
        for ( int  j = 0; j < arr.length; j ++) {
            System.out.print(arr[j]+ " ");
        }

        int max = arr[0];
        for( int i = 0 ; i <arr.length; i ++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("\n");
        System.out.println("GIA TRI LON NHAT LA:" +  max );

    }

}
