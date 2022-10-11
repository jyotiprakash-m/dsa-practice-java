package array_2_apna;

public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        int[] result = reverseArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
