package sorting_apna;

public class CountingSort {
    // O(n+largest element of the array) ->> Linear
    // Useful if all the numbers are +ve
    // If largest number of the array is very high then it will consume lots of
    // memory . Space complexity will increase.
    public static void countingSort(int[] arr) {
        // Find the largest element
        int maxValue = Integer.MIN_VALUE; // -ve Infinite
        for (int i = 0; i < arr.length; i++) {
            maxValue = Math.max(maxValue, arr[i]);
        }

        // Create a counter array
        int[] counter = new int[maxValue + 1];
        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }
        
        //Sort the array
        int j=0;
        for(int i=0;i<counter.length;i++) {
            while(counter[i]>0) {
                arr[j] = i;
                j++;
                counter[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 1, 2 };
        countingSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
