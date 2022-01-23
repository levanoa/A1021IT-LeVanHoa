package _7_Abstract_Class_Interface.Thuc_hanh.Comparable1;

import _6_inheritance.Thuc_hanh.Hinh_hoc.Circle;
import _6_inheritance.Thuc_hanh.Hinh_hoc.Shape;

public interface Comparator<C extends Shape> {
    int compare(Circle c1, Circle c2);

}
