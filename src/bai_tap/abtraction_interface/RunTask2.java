package bai_tap.abtraction_interface;

public class RunTask2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 3);
        shapes[2] = new Square(5);
        shapes[3] = new Rectangle(4, 4);
        shapes[4] = new Square(6);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
            System.out.println("----------------------------------------");
        }
    }

}
