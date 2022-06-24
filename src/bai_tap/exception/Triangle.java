package bai_tap.exception;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 1 || b < 1 || c < 1) {
            String string = (a < 1) ? "a " : "";
            string += (b < 1) ? " b " : "";
            string += (c < 1) ? " c " : "";
            throw new IllegalTriangleException("Cạnh " + string + " nhỏ hơn hoặc bằng 0");
        } else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalTriangleException("tổng hai cạnh bé hơn cạnh còn lại");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


    public int getC() {
        return c;
    }

    public void setABC(int a, int b, int c) throws IllegalTriangleException {
        if (a < 1 || b < 1 || c < 1) {
            String string = (a < 1) ? "a " : "";
            string += (b < 1) ? " b " : "";
            string += (c < 1) ? " c " : "";
            throw new IllegalTriangleException("Cạnh " + string + " nhỏ hơn hoặc bằng 0");
        } else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalTriangleException("tổng hai cạnh bé hơn cạnh còn lại");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
