package array.Bai_tap;

import java.util.Scanner;

public class Add_arr {

        public static void main (String[]args){
            int [] arr = new int[10];
//            int [] arr = {1,2,4,5,6};
//            arr[0] =1;
//            arr[1] =2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số cần thêm ");
            int x = scanner.nextInt();
            System.out.println("nhập vị trí cần thêm");
            int y = scanner.nextInt();

            int n = 4;
            for( int i = 0; i <n; i ++){
                arr[i] = i;
            }

            System.out.println("MẢNG HIỆN TẠI");
            for (int j =0; j  <arr.length;j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("\n");
            if( y > arr.length) {
                System.out.println("KHÔNG THỂ THÊM");
            } else if(y<0){
                System.out.println("KHÔNG THỂ THÊM");
            } else  {
                for (int i = n; i > y; i--) {
                    arr[i] = arr[i-1];
                }
                arr[y] = x;
                System.out.println("\n");
                System.out.println("MẢNG SAU KHI CHÈN");
                for (int j =0; j  <arr.length;j++) {
                    System.out.print(arr[j] + " ");
                }
            }



        }
    }


