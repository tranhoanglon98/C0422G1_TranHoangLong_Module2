package bai_tap.array_method;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr2d = MaxArray2d.declareArray2d("arr2d");
        System.out.println("arr2d :");
        for (int[] a : arr2d) {
            System.out.println(Arrays.toString(a));
        }
        int col;
        do {
            System.out.println("Enter colum you want to sum:");
            col = scanner.nextInt();
            if (col < 0 || col > arr2d.length) {
                System.out.println("Enter colum you want to sum again:");
            }
        } while (col < 0 || col > arr2d.length);

        int sum = 0;
        for (int[] a : arr2d) {
            sum += a[col];
        }
        System.out.println("sum of colum " + col + " = " + sum);
    }
}
