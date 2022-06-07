package thuc_hanh.introduction_to_java;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month do you want to count days?");
        byte month = scanner.nextByte();
        if (month<13 && month >0){
            switch (month) {
                case 2:
                    System.out.println(month + " has 28 or 29 days");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(month + " has 31 days");break;
                default:
                    System.out.println(month + " has 30 days");
            }
        }
    }
}
