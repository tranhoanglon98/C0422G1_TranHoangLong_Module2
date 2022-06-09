package thuc_hanh.array_method;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte size;
        do {
            System.out.println("Enter array size:");
            size = scanner.nextByte();
            if (size > 20 || size < 0) {
                System.out.println("Size only from 0 to 20, enter again");
            }
        } while (size > 20 || size < 0);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array before reverse: " + Arrays.toString(arr));
        for (int i = 0; i < size / 2; i++) {
            int a = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = a;
        }
        System.out.println("Array after reverse: " + Arrays.toString(arr));
    }
}
