package Loop_java.Thuc_hanh;

import java.util.Scanner;

public class Drawing_menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1: Triangle");
        System.out.println("2: Square");
        System.out.println("3: rectangle");
        System.out.println("0: Exit");
        System.out.println("Enter your choice");
        choice = Integer.parseInt(input.nextLine());
        if( choice == 1) {
            int  m =6;
            int  n = 6;
            System.out.println("Draw the triangle");
            for( int i = 0 ; i <n; i ++) {
                for( int j = 0 ; j <m; j ++) {
                    System.out.print("*");
                }
                m--;
                System.out.print("\n");
            }
        }else if (choice ==2) {
            System.out.println("Draw the triangle");
            for( int j = 0 ; j <6; j ++) {
                System.out.println(" * * * * * * ");

            }
        }
        else if (choice == 3) {
            System.out.println("Draw the rectangle");
            for( int j = 0 ; j <3; j ++) {
                System.out.println(" * * * * * * ");

            }
        } else if ( choice == 0) {
            System.exit(0);
        } else {
            System.out.println("No choice!");
        }
    }
}
