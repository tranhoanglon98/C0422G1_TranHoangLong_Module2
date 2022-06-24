package bai_tap.exception;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 1) {
            throw new IllegalTriangleException("Cạnh a nhỏ hơn 0");
        } else if (b < 1) {
            throw new IllegalTriangleException("Cạnh b nhỏ hơn 0");
        } else if (c < 1) {
            throw new IllegalTriangleException("Cạnh c nhỏ hơn 0");
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

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
