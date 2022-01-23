package _6_inheritance.Thuc_hanh.ClassCircle;

public class Main {
    public static void main(String[] args) {
        Circle hinhTron = new Circle(5,"blue");
        hinhTron.tinhDienTich();
        System.out.println(hinhTron.toString());

        Cylinder hinhTru = new Cylinder(5,"b",6);
        hinhTru.tinhTheTich();
        System.out.println(hinhTru.toString());





    }

}
