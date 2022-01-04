package introduction_java.Bai_tap;

import java.util.Scanner;

public class MoneyConversion {
    public static void main(String[] args) {
        double rate = 23000;
        System.out.print("Mời bạn số USD cần chuyển: ");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println("SỐ TIỀN SAU KHI CHUYỂN LÀ: "+ vnd);



         }


    }

