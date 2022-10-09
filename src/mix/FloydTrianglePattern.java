package mix;

public class FloydTrianglePattern {
    public static void main(String[] args) {
        int num = 1;
        for(int i=1;i<=5;i++) {
            for(int j=i;j>0;j--) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }
    }
}
