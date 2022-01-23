package _5_Access_modifier.Bai_tap.AcessModifier;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Circle circle1 = new Circle();
        System.out.println(circle1.getRadius());
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getColor());
    }
}
