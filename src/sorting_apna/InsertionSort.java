package sorting_apna;

public class InsertionSort {
//    O(n^2)
    public static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int currElement = arr[i];
            int prevIndex = i-1;
            
            // Find the correct position to insert
            while(prevIndex>=0 && arr[prevIndex] < currElement) {
                arr[prevIndex+1] = arr[prevIndex];
                prevIndex--;
            }
            
            // Insert the element in the right position
            arr[prevIndex+1] = currElement;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 1, 2 };
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
