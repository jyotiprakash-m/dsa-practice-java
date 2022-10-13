package string_apna;

public class SortestDistance {
    public static void printSortestDistance(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
            }
        }

        System.out.println("Sortest distance: " + (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public static void main(String[] args) {
        String walk = "WNEENESENNN";
        printSortestDistance(walk);
    }

}
