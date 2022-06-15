package thuc_hanh.abstraction_interface.task2;

import thuc_hanh.inheritance_polymorphism.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return (int) (o.getRadius() - this.getRadius());
    }
}
