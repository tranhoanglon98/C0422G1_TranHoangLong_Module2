package bai_tap.inheritance_polymorphism.task3;

import bai_tap.inheritance_polymorphism.task2.Point2D;

public class Run {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(1,2,3,5);
        System.out.println("point1 trước khi di chuyển: " + point1);
        point1.move();
        System.out.println("point1 sau khi di chuyển: " + point1);

        System.out.println("********************************************");
        Point2D point2 = new MovablePoint(2,2,6,9);
        System.out.println("point2 trước khi di chuyển: " + point2);
        ((MovablePoint)point2).move();
        System.out.println("point2 sau khi di chuyển: " + point2);
    }
}
