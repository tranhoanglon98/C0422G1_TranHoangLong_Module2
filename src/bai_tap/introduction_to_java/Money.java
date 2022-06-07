package bai_tap.introduction_to_java;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rate = 23000;
        System.out.println("USD??");
        float usd = Float.parseFloat(scanner.nextLine());
        float vnd = usd * rate;
        System.out.println(usd + " USD " + " = " + vnd + " Đ");
    }
}
