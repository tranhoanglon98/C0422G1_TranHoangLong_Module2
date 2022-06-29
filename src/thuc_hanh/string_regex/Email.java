package thuc_hanh.string_regex;

import java.util.Scanner;

public class Email {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = "";
        do {
            System.out.println("Enter email:");
            email = scanner.nextLine();
            if (!email.matches(EMAIL_REGEX)) {
                System.out.println("email is  Invalid, enter email again");
            }
        } while (!email.matches(EMAIL_REGEX));
        System.out.println("email is valid");
    }
}
