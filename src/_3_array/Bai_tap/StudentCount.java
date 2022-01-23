package _3_array.Bai_tap;

import java.util.Scanner;

public class StudentCount {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(" enter size: ");
            size = Integer.parseInt(scanner.nextLine() );
            if( size >30)
                System.out.println("size should not exceed 30");

        } while (size>30);

        arr = new int[size];
        int  i = 0;
        while (i <arr.length) {
            System.out.println("enter a mark for student: " + (i +1) + ": ");
            arr[i] =Integer.parseInt(scanner.nextLine( ));
            i ++;
        }
        int count = 0;
        System.out.print("list of mark: ");
        for(int j = 0; j < arr.length; j ++) {
            if(arr[j] >=5 && arr[j] <=10)
                count ++;

        }
        System.out.println(count);
    }
}
