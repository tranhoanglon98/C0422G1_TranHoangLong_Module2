package thuc_hanh.loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which number you want to check?");
        int num = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        if (num < 2) {
            System.out.println(num + " is not a prime number");
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    System.out.println(num + " is not a prime number");
                }
            }
            if (flag) {
                System.out.println(num + " is a prime number");
            }
        }
    }
}
