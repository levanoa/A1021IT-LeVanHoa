package _7_Abstract_Class_Interface.Thuc_hanh.Comparable;

import _6_inheritance.Thuc_hanh.Hinh_hoc.Circle;

public interface Comparator<C extends Circle> {
   int compareTo(ComparableCircle o);

}
