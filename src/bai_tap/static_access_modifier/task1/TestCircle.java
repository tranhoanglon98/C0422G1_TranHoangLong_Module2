package bai_tap.static_access_modifier.task1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("radius: " + circle.getRadius());
        System.out.println("area: " + circle.getArea());
    }
}
