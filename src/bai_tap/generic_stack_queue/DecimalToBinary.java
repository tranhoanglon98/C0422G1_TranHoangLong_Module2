package bai_tap.generic_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want to convert to binary:");
        Stack<Integer> binary = new Stack<>();
        int decimalNum = scanner.nextInt();
        while (decimalNum != 0) {
            binary.push(decimalNum % 2);
            decimalNum /= 2;
        }
        String binaryNum = "";
        while (!binary.isEmpty()) {
            binaryNum += binary.pop();
        }
        System.out.println(binaryNum);
    }
}
