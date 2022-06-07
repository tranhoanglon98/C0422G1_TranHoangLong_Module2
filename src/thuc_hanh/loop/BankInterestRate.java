package thuc_hanh.loop;

import java.util.Scanner;

public class BankInterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount : ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of months : ");
        short months = Short.parseShort(scanner.nextLine());
        System.out.println("Enter annual interest rate in percentage : ");
        double interestRate = Double.parseDouble(scanner.nextLine());
        double totalInterest = amount * (interestRate / 100 / 12) * months;
        System.out.println("Total of  interest after " + months + " is : " + totalInterest);
    }
}
