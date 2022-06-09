package bai_tap.array_method;

import java.util.Arrays;
import java.util.Scanner;

public class InsertingElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;

        do {
            System.out.println("Enter length of array:");
            length = scanner.nextInt();
            if (length < 0) {
                System.out.println("Enter length again:");
            }
        } while (length < 0);

        int[] array = new int[length + 1];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element at index " + i);
            array[i] = scanner.nextInt();
        }

        System.out.print("array = [ ");
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }

        System.out.println(" ]");
        System.out.println("Enter new value:");
        int newValue = scanner.nextInt();
        int index;
        do {
            System.out.println("Enter index you want insert:");
            index = scanner.nextInt();
            if (index < 0 || index > length - 1) {
                System.out.println("Enter index again:");
            }
        } while (index < 0 || index > length - 1);

        System.arraycopy(array, index, array, index + 1, length - index);
        array[index] = newValue;
        System.out.println("array after insert " + newValue + " at index " + index +
                "\n array = " + Arrays.toString(array));
    }
}