package test;

import java.util.Arrays;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int number = Integer.parseInt(scanner.nextLine());
        Double[] money = new Double[number];
        for (int i = 0; i < money.length; i++) {
            System.out.println("Enter money  " + i);
            money[i] = Double.parseDouble(scanner.nextLine());
        }
        System.out.println(Arrays.toString(money));
        double max = money[0];
        for (int i = 0; i < money.length; i++) {
            if ( money[i] > max) {
                max = money[i];
            }
        }
        System.out.println(max);
    }

}
