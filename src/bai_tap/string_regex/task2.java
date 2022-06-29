package bai_tap.string_regex;

import java.util.Scanner;

public class task2 {
    private static final String PHONE_NUMBER_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public static boolean phoneNumberCheck(String phoneNumber) {
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choose = "";
        do {
            System.out.println("1. check phone number." +
                    "\n0. exit.");
            choose = scanner.nextLine();
            switch (choose) {
                case "1": {
                    System.out.println("Enter phone number you want to check:");
                    String phoneNumber = scanner.nextLine();
                    System.out.println(phoneNumber + " is " + phoneNumberCheck(phoneNumber));
                }
                break;
                case "0":
                    System.out.println("-------Exit-------");
                    break;
            }
        } while (!choose.equals("0"));
    }
}
