package bai_tap.array_method;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scanner.nextInt();
        int[][] array2d = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter element at index [ " + i + " ][ " + j + " ]");
                array2d[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        System.out.println("arr2d = [ ");
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(array2d[i]));
            sum += array2d[i][i];
        }
        System.out.println("]");
        System.out.println("sum = " + sum);
    }
}
