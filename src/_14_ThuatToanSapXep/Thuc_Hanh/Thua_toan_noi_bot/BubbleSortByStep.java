package _14_ThuatToanSapXep.Thuc_Hanh.Thua_toan_noi_bot;

import java.util.Scanner;

public class BubbleSortByStep extends BubbleSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter list size");
        int size = scanner.nextInt();
        int[] list1 = new int[size];

        System.out.println("enter " + list1.length + " values: ");
        for(int i = 0; i<list1.length; i ++) {
            list1[i] = scanner.nextInt();
        }

        System.out.println("your input list: ");
        for(int i = 0 ; i< list1.length; i ++){
            System.out.println(list1[i] + "\t");
        }
        System.out.println("danh sách đã sắp xếp");
        bubbleSort(list1);
        for(int i = 0; i<list1.length; i ++) {
            System.out.println(list1[i] + " ");
        }

    }
}
