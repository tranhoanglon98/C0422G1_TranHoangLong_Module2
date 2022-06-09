package bai_tap.array_method;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArray2d {
    public static void main(String[] args) {
        int[][] arr2d = declareArray2d("arr2d");
        int max = arr2d[0][0];
        System.out.println("arr2d = [ ");
        for (int[] a : arr2d) {
            for (int b : a) {
                if (b > max) {
                    max = b;
                }
            }
        }
        for (int[] a : arr2d) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println(" ].");
        System.out.println("max = " + max);
    }

    public static int[][] declareArray2d(String arrName) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        do {
            System.out.println("Enter rows of " + arrName);
            rows = scanner.nextInt();
            if (rows < 0) {
                System.out.println("Enter rows again");
            }
        } while (rows < 0);

        do {
            System.out.println("Enter colums of " + arrName);
            cols = scanner.nextInt();
            if (cols < 0) {
                System.out.println("Enter cols again");
            }
        } while (cols < 0);
        int[][] arr2d = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at [" + i + " ][ " + j + " ]");
                arr2d[i][j] = scanner.nextInt();
            }
        }
        return arr2d;
    }
}
