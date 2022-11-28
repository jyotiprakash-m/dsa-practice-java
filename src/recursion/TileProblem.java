package recursion;

public class TileProblem {
    // Tile size = 2*1 and Floor size = 2*n
    // n = length
    public static int findNoOfWays(int n) {
        if (n == 0 || n == 1)
            return 1;

        // Vertical choice
        int verticalChoice = findNoOfWays(n - 1);
        int horizontalChoice = findNoOfWays(n - 2);
        return verticalChoice * horizontalChoice;
    }

    public static void main(String[] args) {
        System.out.println(findNoOfWays(4));
    }

}
