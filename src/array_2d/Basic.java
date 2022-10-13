package array_2d;

import java.util.Scanner;

public class Basic {
// print arr
    public static void printArray(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

//    Find largest and smallest
    public static void findLargest(int[][] arr, int row, int col) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                maxValue = Math.max(maxValue, arr[i][j]);
                minValue = Math.min(minValue, arr[i][j]);
            }
        }

        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);

    }

    public static void main(String[] args) {
//        Insertion
        int row = 3;
        int col = 3;
//        int[][] arr = new int[row][col];
        int[][] arr = { { 1, 2, 3 }, { 5, 6, 7 }, { 4, 7, 9 } };
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }

//        Print
        printArray(arr, row, col);
        findLargest(arr, row, col);

    }
}
