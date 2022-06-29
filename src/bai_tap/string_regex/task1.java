package bai_tap.string_regex;

import java.util.Scanner;

public class task1 {
    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public static boolean classNameCheck(String className) {
        return className.matches(CLASS_NAME_REGEX);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choose = "";
        do {
            System.out.println("1. check class name." +
                    "\n0. exit.");
            choose = scanner.nextLine();
            switch (choose) {
                case "1": {
                    System.out.println("Enter class name you want to check:");
                    String className = scanner.nextLine();
                    System.out.println(className + " is " + classNameCheck(className));
                }
                break;
                case "0":
                    System.out.println("-------Exit-------");
                    break;
            }
        } while (!choose.equals("0"));
    }
}
