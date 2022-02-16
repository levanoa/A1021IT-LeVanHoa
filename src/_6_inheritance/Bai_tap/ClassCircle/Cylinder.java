import _6_inheritance.Bai_tap.ClassCircle.Circle;

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

       public float tinhTheTich() {
        return theTich = dienTich * hight;
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
