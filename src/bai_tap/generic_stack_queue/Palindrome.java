package bai_tap.generic_stack_queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String string = scanner.nextLine();

        Stack<Character> stringStack = new Stack<>();
        Queue<Character> stringQueue = new ArrayDeque<>();
        for (int i = 0; i < string.length(); i++) {
            stringStack.push(((string).toLowerCase().charAt(i)));
            stringQueue.add(((string).toLowerCase().charAt(i)));
        }
        boolean isPalindrome = true;
        for (int i = 0; i < string.length(); i++) {
            if (stringStack.pop() != stringQueue.poll()) {
                System.out.println("not palindrome String.");
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("palindrome string.");
        }
    }
}

