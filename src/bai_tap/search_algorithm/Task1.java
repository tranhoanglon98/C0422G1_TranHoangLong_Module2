package bai_tap.search_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        ArrayList<Character> maxList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            ArrayList<Character> characterList = new ArrayList<>();
            characterList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                int lastIndex = characterList.size() - 1;
                if (string.charAt(j) > characterList.get(lastIndex)) {
                    characterList.add(string.charAt(j));
                }
            }
            if (characterList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(characterList);
            }
        }
        System.out.println(maxList);
    }
}
