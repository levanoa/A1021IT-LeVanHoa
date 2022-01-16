package inheritance.Bai_tap.ClassMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(5,5);
        System.out.println(p.toString());
        p.setX(333);
        System.out.println(p.getX());

        MoveablePoint m = new MoveablePoint(8,8);
        System.out.println(m.toString());
    }


}
