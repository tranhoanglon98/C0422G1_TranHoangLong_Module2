package bai_tap.generic_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    private static final char LEFT_BRACKET = '(';
    private static final char RIGHT_BRACKET = ')';

    public static boolean checkBracket(String expression) {
        Stack<Character> characterStack = new Stack<>();
        boolean isExpression = true;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == LEFT_BRACKET) {
                characterStack.push(expression.charAt(i));
            } else if (expression.charAt(i) == RIGHT_BRACKET) {
                if (characterStack.isEmpty()) {
                    isExpression = false;
                    break;
                } else {
                    characterStack.pop();
                }
            }
        }
        if (!isExpression) {
            return false;
        } else return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a expression");
        String expression = scanner.nextLine();
        System.out.println(checkBracket(expression));
    }
}
