package _7_Abstract_Class_Interface.Bai_tap.interfaceResizeable;

import _7_Abstract_Class_Interface.Bai_tap.Colorable.Colorable;

import java.util.Scanner;

public class Circle implements Resizeable, Colorable {
    private double radius = 1.0;




    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;

    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

//    @Override
//    public void resize(double percent) {
//
//    }

    @Override
    public void resize(double percent) {
        System.out.print("Circle sau khi tăng là: ");

        double area = getArea() + (percent * getArea());

        System.out.println(area);


    }
    @Override
    public void howToColor(){


    }
}
