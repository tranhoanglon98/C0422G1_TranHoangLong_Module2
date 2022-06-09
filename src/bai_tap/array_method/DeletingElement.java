package bai_tap.array_method;

import java.util.Arrays;
import java.util.Scanner;

public class DeletingElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short length;
        do {
            System.out.println("Enter length of array:");
            length = scanner.nextShort();
            if (length < 0) {
                System.out.println("the Length has to greater or equal to 0.");
            }
        } while (length < 0);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element at index " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Enter value you want to delete:");
        int value = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            if (value == array[i]) {
                System.arraycopy(array, i + 1, array, i, length - 1 - i);
                array[length - 1] = 0;
                System.out.println(value + " at index " + i + " in array.");
            }
        }
        System.out.println("Array after delete " + value + " : " + Arrays.toString(array));
    }
}
