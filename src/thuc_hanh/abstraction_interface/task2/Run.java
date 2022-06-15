package thuc_hanh.abstraction_interface.task2;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(5);
        circles[1] = new ComparableCircle(3);
        circles[2] = new ComparableCircle(9);
        System.out.println(Arrays.toString(circles));
        Arrays.sort(circles);
        System.out.println(Arrays.toString(circles));
    }
}
