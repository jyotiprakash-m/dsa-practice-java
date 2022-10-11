package sorting_apna;

public class SelectionSort {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            // Swap
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 1, 2 };
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
