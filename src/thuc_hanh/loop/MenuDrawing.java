package thuc_hanh.loop;

import java.util.Scanner;

public class MenuDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte choice = -1;
        while (choice != 0) {
            System.out.println("1. Draw the triangle.");
            System.out.println("2. Draw the rectangle.");
            System.out.println("3. Draw the square.");
            System.out.println("0. Exit.");
            System.out.println("Enter your choice");
            choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5 - i; j > 0; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 20; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}
