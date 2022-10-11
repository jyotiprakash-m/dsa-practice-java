package advance_pattern;

public class Rectangle {
    public static void printRectangle(int row, int col) {
        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                if (r==1 || r==row || c==1 || c==col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printRectangle(4, 5);
    }

}
