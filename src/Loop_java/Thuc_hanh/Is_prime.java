package Loop_java.Thuc_hanh;

import java.util.Scanner;

public class Is_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int num = Integer.parseInt(scanner.nextLine());
        if( num < 2) {
            System.out.println(num+ " is not a prime");
        }
        else {
            int i = 2;
            boolean check = true;
            for(; i <= Math.sqrt(num) ; i ++) {
                if(num % i == 0) {
                    check = false;
                    break;
                }
            }
//            while (i< num) {
//                if(num %i == 0) {
//                    check = false;
//                    break;
//                } i ++;
//            }

            if( check)
                System.out.println(num + " is a prime");
            else
                System.out.println(num+" is not a prime");
        }
    }
}
