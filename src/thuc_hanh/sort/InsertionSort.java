package thuc_hanh.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void  insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] array = {121, 5, 87, 6, 33, 10, 87, 24, 3, 8, 9};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));

    }
}


