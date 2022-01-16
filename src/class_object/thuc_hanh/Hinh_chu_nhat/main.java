package class_object.thuc_hanh.Hinh_chu_nhat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" enter width: ");
        double width = scanner.nextDouble();
        System.out.print(" enter height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height) ;

        System.out.println("your rectangle:  \n " +  rectangle.display());
        System.out.println(" perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());

    }
}
