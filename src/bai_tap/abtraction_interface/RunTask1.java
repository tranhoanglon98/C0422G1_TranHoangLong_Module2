package bai_tap.abtraction_interface;


public class RunTask1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5.6, 4);
        shapes[2] = new Square(9);
        System.out.println("********************** After resize **********************");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("------------------");
        }
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(Math.random()*100);
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(Math.random()*100);
            } else {
                ((Square) shape).resize(Math.random()*100);
            }
        }
        System.out.println("********************** Before resize **********************");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("------------------");
        }
    }
}
