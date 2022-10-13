package string_apna;

public class LargestString {
    public static void findLargestString(String[] arr) {
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        System.out.println("Largest string: " + largest);
    }

    public static void main(String[] args) {
        String[] arr = { "apple", "airplane", "zebra" };
        findLargestString(arr);
    }
}
