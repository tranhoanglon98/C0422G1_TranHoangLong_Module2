package bai_tap.generic_stack_queue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        int arrayLength = Integer.parseInt(scanner.nextLine());
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("enter element at " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("before reverse : " + Arrays.toString(array));
        Stack<Integer> reverseArray = new Stack<>();
        for (int element : array) {
            reverseArray.add(element);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reverseArray.pop();
        }
        System.out.println("before reverse : " + Arrays.toString(array));

        System.out.println("enter a string:");
        String string = scanner.nextLine();
        Stack<String> stringStack = new Stack<>();
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            stringStack.push(words[i]);
        }
        string = "";
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                string += stringStack.pop();
            } else {
                string += stringStack.pop() + " ";
            }
        }
        System.out.println(string);
    }
}
