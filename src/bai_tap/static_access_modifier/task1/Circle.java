package bai_tap.static_access_modifier.task1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return radius * Math.PI * Math.PI;
    }
}
