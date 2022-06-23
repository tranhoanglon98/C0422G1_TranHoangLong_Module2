package thuc_hanh.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean needNextPass = true;
        int count = 0;
        for (int i = 0; i < array.length && needNextPass; i--) {
            needNextPass = false;
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    System.out.println(++count);
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,2,1};
//        int[] array = {9,8,7,6,5,4,3,2,1,0};
//        int[] array = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
