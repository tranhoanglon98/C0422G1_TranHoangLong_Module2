package thuc_hanh.introduction_to_java;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight (kg)");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height (m)");
        float height = scanner.nextFloat();
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Under weight");
        } else if (bmi < 25) {
            System.out.println("Nomal");
        } else if (bmi < 30) {
            System.out.println("Over weight");
        } else {
            System.out.println("Obese");
        }
    }
}
