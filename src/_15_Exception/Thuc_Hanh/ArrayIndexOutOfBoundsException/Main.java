package _15_Exception.Thuc_Hanh.ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gía trị của phần tử có chỉ số" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("chỉ số vượt quá giới hạn của mảng");
        }
    }


}
