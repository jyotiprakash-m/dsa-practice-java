package array;

/**
 * Q1 Maximum and minimum of an array using minimum number of comparisons
 */
public class Q1 {
    static class Result {
        int max;
        int min;

    }

    public static Result findMaxMin(int arr[], int n) {
        Result result = new Result();
        // Null
        if (arr == null) {
            result = null;
        }
        // One element
        if (n == 1) {
            result.min = arr[0];
            result.max = arr[0];
        } else {
            // General case (2 or more then 2)
            // compare first two values
            if (arr[0] < arr[1]) {
                result.min = arr[0];
                result.max = arr[1];
            } else {
                result.min = arr[1];
                result.max = arr[0];
            }
            for (int i = 2; i < n; i++) {
                if (arr[i] > result.max) {
                    result.max = arr[i];
                } else if (arr[i] < result.min) {
                    result.min = arr[i];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, -1, 330, 3000 };
        int arr_size = 6;
        Result result = findMaxMin(arr, arr_size);
        if (result == null) {
            System.out.println("Array is null");
        } else {
            System.out.println("Max: " + result.max);
            System.out.println("Min: " + result.min);
        }
    }
}