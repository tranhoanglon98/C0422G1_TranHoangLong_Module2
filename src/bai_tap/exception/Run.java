package bai_tap.exception;


import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        do {
            try {
                System.out.println("Nhập cạnh a.");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh b.");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh c.");
                int c = Integer.parseInt(scanner.nextLine());
                triangle.checkTriangle(a, b, c);
                System.out.println(a + "," + b + "," + c + " là ba cạnh của tam giác.");
                break;

            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            }
        } while (true);
    }
}
