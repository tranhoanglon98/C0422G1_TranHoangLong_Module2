package bai_tap.search_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        ArrayList<Character> maxList = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            ArrayList<Character> characters = new ArrayList<>();
            characters.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                int lastIndex = characters.size() - 1;
                if (string.charAt(j) > characters.get(lastIndex)) {
                    characters.add(string.charAt(j));
                } else {
                    break;
                }
            }

            if (characters.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(characters);
            }
        }
        System.out.println(maxList);
    }
}
