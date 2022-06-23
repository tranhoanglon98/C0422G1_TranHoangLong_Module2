package thuc_hanh.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {121, 5, 87, 6, 33, 10, 87, 24, 3, 8, 9};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

}
