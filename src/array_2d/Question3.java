package array_2d;

public class Question3 {
    public static void printArray(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] arr, int row, int col) {
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        // Transpose of the matrix
        int row = 2;
        int col = 3;
        int[][] matrix = { { 1, 3, 5 }, { 4, 5, 6 } };
        printArray(matrix, row, col);
        System.out.println();
        printArray(transposeMatrix(matrix, row, col), col, row);
    }
}
