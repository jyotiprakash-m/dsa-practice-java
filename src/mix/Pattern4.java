package mix;

public class Pattern4 {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i=1;i<5;i++) {
            for(int j=i;j>0;j--) {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }

    }
}
