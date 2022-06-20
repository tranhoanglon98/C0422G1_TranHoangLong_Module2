package bai_tap.generic_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a expression");
        String expression = scanner.nextLine();
        Stack<Character> characterStack = new Stack<>();
        boolean isExpression = true;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                characterStack.push(expression.charAt(i));
            } else {
                if (characterStack.isEmpty()) {
                    isExpression = false;
                } else {
                    characterStack.pop();
                }
            }
        }
        if (!isExpression) {
            System.out.println("false");
        } else if (characterStack.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
