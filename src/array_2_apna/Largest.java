package array_2_apna;

public class Largest {
    class Result {
        int min;
        int max;
    }

    public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 9, 14 };
        System.out.println("Largest: "+findLargest(arr));
    }
}
