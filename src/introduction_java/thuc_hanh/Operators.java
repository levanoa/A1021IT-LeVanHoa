package introduction_java.thuc_hanh;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = scanner.nextFloat();

        System.out.print("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("area is: " + area);
    }
}
