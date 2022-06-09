package bai_tap.array_method;

import java.util.Arrays;

public class MinOfArray {
    public static void main(String[] args) {
        int[] array = MergingArray.declareArray("array");
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        System.out.println("min = " + min);
    }
}
