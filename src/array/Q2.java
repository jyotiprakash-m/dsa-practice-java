package array;

/**
 * Q2 Reverse the array
 */
public class Q2 {
//    Print array
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

//    Approach 1 (Brute force)
    static int[] bruteForce(int[] arr) {
        int[] result = new int[arr.length];
        ;
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[arr.length - 1 - i];
            }
        }
        return result;
    }

//    Approach 2 (Brute force 2)
    static int[] bruteForce2(int[] arr) {
        int[] result = new int[arr.length];
        int i = 0;
        if (arr != null) {
            while (i < arr.length) {
                result[i] = arr[arr.length - 1 - i];
                i++;
            }
        }
        return result;
    }

//    Approach 3 (Swap)
    static int[] reverseBySwaping(int[] arr) {
        if (arr != null) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return arr;
    }

//    Approach 4 (Recursion)
    static int[] reverseByRecurssion(int[] arr, int start, int end) {
        if (arr != null && start <= end) { 
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseByRecurssion(arr, start + 1, end - 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

//        
        int[] result = reverseByRecurssion(arr, 0, arr.length-1);
//        reverseBySwaping(arr);
        printArray(result);

    }

}
