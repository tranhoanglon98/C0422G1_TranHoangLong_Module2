package bai_tap.array_method;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArray2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        do {
            System.out.println("Enter rows:");
            rows = scanner.nextInt();
            if (rows < 0) {
                System.out.println("Enter rows again");
            }
        } while (rows < 0);

        do {
            System.out.println("Enter colums:");
            cols = scanner.nextInt();
            if (cols < 0) {
                System.out.println("Enter cols again");
            }
        } while (cols < 0);
        int[][] arr2d = new int[rows][cols];
        int max = arr2d[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at [" + i + " ][ " + j + " ]");
                arr2d[i][j] = scanner.nextInt();
                if (arr2d[i][j] > max) {
                    max = arr2d[i][j];
                }
            }
        }
        System.out.println("arr2d = [ ");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr2d[i]));
        }
        System.out.println(" ].");
        System.out.println("max = " + max);
    }
}
