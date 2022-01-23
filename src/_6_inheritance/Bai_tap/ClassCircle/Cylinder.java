package _6_inheritance.Thuc_hanh.ClassCircle;

public class Cylinder extends Circle {
    public float hight =5f;
    public float theTich;

    public Cylinder(float banKinh, String color, float hight) {
        super(banKinh, color);
        this.hight = hight;

    }
    public void setHight(float hight) {
        this.hight = hight;
    }
    public float getHight() {
        return hight;
    }

       public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * hight;
       }
       public float getTheTich() {
        return theTich;
          }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hight=" + hight +
                ", theTich=" + theTich +
                '}';
    }
}
