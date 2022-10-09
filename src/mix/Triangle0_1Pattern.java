package mix;

public class Triangle0_1Pattern {
    public static void main(String[] args) {
        boolean bool = true;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j > 0; j--) {
                if (bool) {
                    System.out.print(1 + " ");
                    bool = false;
                } else {
                    System.out.print(0 + " ");
                    bool = true;
                }
            }
            System.out.println("");
        }
    }

}
