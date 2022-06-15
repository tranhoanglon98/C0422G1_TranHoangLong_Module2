package bai_tap.abtraction_interface.task2;

public class Square extends Shape implements Colorable {
    private double width = 1;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 2 * (width + width);
    }

    @Override
    public String toString() {
        return "A Square with width="
                + getWidth()
                + "\n area: "
                + getArea()
                + "\n perimeter: "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
