package _7_Abstract_Class_Interface.Bai_tap.interfaceResizeable;

import _6_inheritance.Thuc_hanh.Hinh_hoc.Rectangle;
import _7_Abstract_Class_Interface.Bai_tap.Colorable.Colorable;

public class Square extends Rectangle implements Colorable {
    public  Square (){

    }
    public Square(double side) {
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(side,side, color,filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}