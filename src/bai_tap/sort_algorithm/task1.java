package bai_tap.sort_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void insertionSort(int[] array) {
        int pos, x;

        for (int i = 1; i < array.length; i++) {
            pos = i;
            x = array[pos];
            System.out.println("chèn vị trí thích hợp cho phần tử: " + array[pos] + " index: " + pos);
            System.out.println(Arrays.toString(array));
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println(array[pos - 1] + "-->" + array[pos]);
                array[pos] = array[pos - 1];
                pos--;
                System.out.println(Arrays.toString(array));
            }
            System.out.println(x + "-->" + array[pos]);
            array[pos] = x;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at index + " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("array before sort");
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------------------------------");
        insertionSort(array);
        System.out.println("---------------------------------------------------");
        System.out.println("array after sort");
        System.out.println(Arrays.toString(array));
    }
}
