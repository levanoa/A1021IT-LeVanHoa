package _11_Stack_Queue.Bai_tap.Chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Change {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Stack<String> stackSoDu = new Stack<String>();
        System.out.println("Nhập 1 số nguyên dương từ bàn phím");
        int x = scanner.nextInt();
        while(x>0) {
            int soDu = x%2;
            System.out.println(soDu);
            stackSoDu.push(soDu+"");
            x = x/2;
        }
        System.out.println("Số nhị phân là:");
        int n = stackSoDu.size();
        for(int i=0; i<n; i++) {
            System.out.print(stackSoDu.pop());
        }
    }

}
