package array_2d;

public class Question1 {
    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
//        How many times 7 is occurs
        int count=0;
        for(int i = 0;i<array.length;i++) {
            for(int j = 0;j<array[0].length;j++) {
                if(array[i][j]==7) {
                    count++;
                }
            }
        }
        
        System.out.println("7 is present "+count+" times");
        
    }
}
