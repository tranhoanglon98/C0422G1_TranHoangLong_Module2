package thuc_hanh.array_method;

import java.util.Arrays;
import java.util.Scanner;

public class MinOfArray {
    public static int minValue(int[] array) {

        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte length;
        do {
            System.out.println("Enter length of array: ");
            length = scanner.nextByte();
            if (length < 0) {
                System.out.println("The length has to be greater or equal to 0, enter again.");
            }
        } while (length < 0);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element at index " + i + " :");
            array[i] = scanner.nextInt();
        }
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("min Value is " + minValue(array));
    }
}
