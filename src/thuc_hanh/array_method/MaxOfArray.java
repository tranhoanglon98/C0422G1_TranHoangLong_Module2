package thuc_hanh.array_method;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte length;
        do {
            System.out.println("Enter length of list: ");
            length = scanner.nextByte();
            if (length > 20 || length < 0) {
                System.out.println("length only from 0 to 20, enter again.");
            }
        } while (length > 20 || length < 0);
        float[] list = new float[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + (i + 1) + " :");
            list[i] = scanner.nextFloat();
        }
        System.out.println("List: " + Arrays.toString(list));
        float max = list[0];
        int index = 1;
        for (int i = 0; i < length; i++) {
            if (list[i] > max) {
                max = list[i];
                index = i + 1;
            }
        }
        System.out.println("Max = " + max + " Billion dollar, at position " + index);
    }
}
