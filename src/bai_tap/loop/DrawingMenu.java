package bai_tap.loop;

import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte chooice = -1;
        System.out.println("1. Print the rectangle.");
        System.out.println("2. Print the triangle.");
        System.out.println("3. Print the isosceles triangle.");
        System.out.println("0. Exit");
        while (chooice != 0) {
            System.out.println("Enter your choice.");
            chooice = scanner.nextByte();
            switch (chooice) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 20; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2: {
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5 - i; j > 0; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j <= 5 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j == 4 || i == 0 || i <= j) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i == 5 || j == 5 || j > 5 - i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                break;
                case 3: {
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 9; j++) {
                            if (j > 5 - i && j < 5 + i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                break;
                case 0:
                    System.out.println("End.");
                    break;
                default:
                    System.out.println("No choice");
            }
        }
    }
}

