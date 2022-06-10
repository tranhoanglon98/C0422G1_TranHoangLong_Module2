package thuc_hanh.class_object;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public void display() {
        System.out.println("width: " + this.width +
                "\n height: " + this.height +
                "\n area : " + getArea() +
                "\n perimeter: " + getPerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.5, 5.6);
        rectangle.display();
    }
}
