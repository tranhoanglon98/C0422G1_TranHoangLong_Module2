package bai_tap.exception;


import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        do {
            try {
                System.out.println("Nhập cạnh a:");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh b:");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh c:");
                int c = Integer.parseInt(scanner.nextLine());
                triangle.setABC(a, b, c);
                System.out.println(a + "," + b + "," + c + " là ba cạnh của một tam giác.");
                break;

            } catch (NumberFormatException | IllegalTriangleException e) {
                System.out.println("Exception: " + e.getMessage());
                System.out.println("Hãy nhập lại");
            }
        } while (true);
    }
}
