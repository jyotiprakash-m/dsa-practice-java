package sorting_apna;

// Sort the array in descending order

public class Question {
//    Bubble Sort (Track the biggest element)
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }

    }
//    Selection Sort (Track the smallest element)
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
//    Insertion Sort
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
//    Counting Sort
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
        for(int i=counter.length-1;i>=0;i--) {
            while(counter[i]>0) {
                arr[j] = i;
                j++;
                counter[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        countingSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
