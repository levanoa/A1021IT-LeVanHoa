package introduction_java.Bai_tap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        System.out.print("Mời bạn nhập số cần đọc: ");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= 0 && num <=10) {
            switch (num){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                default:
                    System.out.println("out of ability");

            }
        } else if ( num >10 && num <=20) {
            switch (num) {
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thir" + "teen");
                    break;
                case 14:
                    System.out.println("four" + "teen");
                    break;
                case 15:
                    System.out.println("fif" + "teen");
                    break;
                case 16:
                    System.out.println("six" + "teen");
                    break;
                case 17:
                    System.out.println("seven" + "teen");
                    break;
                case 18:
                    System.out.println("eight" + "teen");
                    break;
                case 19:
                    System.out.println("nine" + "teen");
                    break;
                case 20:
                    System.out.println("twenty");
                    break;

            }

        }



    }
}
