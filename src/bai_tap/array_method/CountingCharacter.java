package bai_tap.array_method;

import java.util.Scanner;

public class CountingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = scanner.nextLine();
        System.out.println("Enter character you want to count:");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("String: " + str);
        System.out.println("Character: " + character);
        System.out.println(str + " has " + count + " character " + character);
    }
}
