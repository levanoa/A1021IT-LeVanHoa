package _6_inheritance.Thuc_hanh.ClassCircle;


public class Circle {
    public float banKinh;
    public float dienTich;
    public final float PI = 3.14f;
    public String color;

    public Circle(float banKinh,String color){
        this.banKinh = banKinh;
        this.color = color;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }


    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "banKinh=" + banKinh +
                ", dienTich=" + dienTich +
                ", PI=" + PI +
                ", color='" + color + '\'' +
                '}';
    }
}
