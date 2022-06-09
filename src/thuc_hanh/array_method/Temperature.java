package thuc_hanh.array_method;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte choice;
        double result;
        do {
            System.out.println("1. Fahrenheit to Celsius.");
            System.out.println("2. Celsius to Fahrenheit.");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextByte();
            switch (choice) {
                case 1: {
                    System.out.println("Enter Fahrenheit:");
                    float fahrenheit = scanner.nextFloat();
                    result = (5.0 / 9) * (fahrenheit - 32);
                    System.out.println(fahrenheit + " Fahrenheit = " + result + " Celsius.");
                }
                break;
                case 2: {
                    System.out.println("Enter Celsius:");
                    float Celsius = scanner.nextFloat();
                    result = Celsius / 1.8 + 32;
                    System.out.println(Celsius + " Celsius = " + result + " Fahrenheit.");
                }
                break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("choice only from 0 to 2, Enter your choice again: ");
            }
        } while (choice != 0);
    }
}
