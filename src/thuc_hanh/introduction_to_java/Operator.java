package thuc_hanh.introduction_to_java;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        width = scanner.nextFloat();
        System.out.println("Enter height");
        height = scanner.nextFloat();
        System.out.println("Area = " + width * height);
    }
}
