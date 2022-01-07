package array.Bai_tap;

import java.sql.Array;
import java.util.Scanner;

public class Delete_arr {

        public static void main(String[] args) {
                int [] arr = {1,2,3,5};
                 int c,i;
//                int [] newArr = new int[4];
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập số cần xóa ");
                int x = scanner.nextInt();
                for(c = i = 0 ; i < arr.length; i ++) {
                        if(arr[i] != x) {
                               arr[i] = arr[i];
                             c++;
                        }
                }
//                System.out.println(newArr);

                System.out.println("Mảng sau khi xóa phần tử " + x + " là: ");
                for(int j= 0 ; j < c; j++) {
                        System.out.print(arr[j] + "\t");
                }
        }

}
