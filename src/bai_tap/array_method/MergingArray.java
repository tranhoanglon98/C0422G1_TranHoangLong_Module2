package bai_tap.array_method;

import java.util.Arrays;
import java.util.Scanner;

public class MergingArray {
    public static void main(String[] args) {
        int[] arr1 = DeclareArray("arr1");
        int[] arr2 = DeclareArray("arr2");
        int lengthArr3 = arr1.length + arr2.length;
        int[] arr3 = new int[lengthArr3];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, lengthArr3 - arr1.length, arr2.length);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
    }

    public static int[] DeclareArray(String arrayName) {
        Scanner scanner = new Scanner(System.in);
        int length;
        do {
            System.out.println("Enter length of " + arrayName);
            length = scanner.nextInt();
            if (length < 0) {
                System.out.println("Enter length again :");
            }
        } while (length < 0);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element at index " + i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
