package _7_Abstract_Class_Interface.Thuc_hanh.Comparable1;

import _6_inheritance.Thuc_hanh.Hinh_hoc.Circle;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
