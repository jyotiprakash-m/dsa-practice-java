package array_2_apna.assignment;

public class Question1 {
    public static boolean isDuplicateValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        System.out.println(isDuplicateValue(arr));
    }
}
