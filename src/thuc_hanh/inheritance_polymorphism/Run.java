package thuc_hanh.inheritance_polymorphism;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle("red", true, 1.5);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle("yellow", true, 3.0, 5.0);
        System.out.println(rectangle);
        Square square = new Square(5.2);
        System.out.println(square);
    }
}
