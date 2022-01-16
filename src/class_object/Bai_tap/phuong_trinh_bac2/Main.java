package class_object.thuc_hanh.phuong_trinh_bac2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" PT có dạng ax^2 + bx + c = 0  ");
        Scanner scanner = new Scanner(System.in);
        System.out.print(" enter a: ");
        double a = scanner.nextDouble();
        System.out.print(" enter b: ");
        double b = scanner.nextDouble();
        System.out.print(" enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c) ;
        if( quadraticEquation.getDiscriminant() < 0) {
            System.out.println(" Phương trình vô nghiệm");

        } else if ( quadraticEquation.getDiscriminant() > 0 ) {
            System.out.println("root1: " + quadraticEquation.getRoot1() + "root2: " + quadraticEquation.getRoot2());
        } else {
            System.out.println("1 nghiem kep" + quadraticEquation.getkep());
        }

    }

}
