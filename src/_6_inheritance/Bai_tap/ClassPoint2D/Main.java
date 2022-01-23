package _6_inheritance.Bai_tap.ClassPoint2D;

public class Main {
    public static void main(String[] args) {
        Point2d point = new Point2d();
        System.out.println(point.toString());
        for(int i =0; i< point.getXY().length; i++) {
            System.out.println(point.getXY()[i]);
        }
        Point2d point1 = new Point2d(3,4);
        System.out.println(point1.toString());

        Point3De point3 = new Point3De();
        System.out.println(point3.toString());
        point3.setXYZ(1,5,6);
        System.out.println(point3.toString());

        for(int i =0; i< point3.getXYZ().length; i++) {
            System.out.println(point3.getXYZ()[i]);
        }


    }

}
