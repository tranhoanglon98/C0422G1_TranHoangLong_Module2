package bai_tap.inheritance_polymorphism.task1;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue");
        Cylinder cylinder = new Cylinder(6, "green", 8);
        System.out.println(circle);
        System.out.println(cylinder);
    }
}
