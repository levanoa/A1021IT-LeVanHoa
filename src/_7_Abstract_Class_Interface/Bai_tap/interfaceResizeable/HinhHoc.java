package _7_Abstract_Class_Interface.Bai_tap.interfaceResizeable;

public class HinhHoc {
    public static void main(String[] args) {

        Circle c = new Circle();
        System.out.println("HINH TRUOC KHI TANG LA: " +  c.getArea());
        c.resize(0.5);

        Rectangle rectangle = new Rectangle();
        System.out.println("HINH TRUOC KHI TANG LA: " + rectangle.getArea());
        rectangle.resize(0.2);


    }
}
