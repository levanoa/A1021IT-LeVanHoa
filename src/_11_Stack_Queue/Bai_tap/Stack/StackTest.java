package _11_Stack_Queue.Bai_tap.Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[] {1,6,3,4,5};
        int a = array.length;
        Stack<String> stackChuoi = new Stack<String>();
        Stack<Integer> stackSoNguyen = new Stack<Integer>();

        System.out.println("nhập vào chuỗi String" );
        String s = scanner.nextLine();
        for(int i = 0; i<s.length(); i++) {
            stackChuoi.push(s.charAt(i) + "");
        }
        System.out.println(" chuỗi đảo ngược ");
        for(int i = 0; i<s.length(); i++) {
            System.out.println(stackChuoi.pop());
        }

        System.out.println("----------số đảo ngược ");

        for(int i = 0; i<a; i++) {
            stackSoNguyen.push(array[i]);
        }
        System.out.println(" mảng số đảo ngược ");
        for(int i = 0; i<a; i++) {
            System.out.println(stackSoNguyen.pop());
        }
    }
}
