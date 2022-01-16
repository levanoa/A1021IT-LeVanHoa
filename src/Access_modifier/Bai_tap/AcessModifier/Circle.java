package Access_modifier.Bai_tap.AcessModifier;

public class Circle {
    private double radius =1.0;
    private String color = " red";

    public Circle(){

    }
    public Circle(double radius) {
        this.radius =radius;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        double dt = radius * radius * 3.14;
        return dt;

    }
}
