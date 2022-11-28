package divide_and_conqrue;

public class QuickSort {
    public static void printArray(int arr[]) {
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIdx = partion(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    private static int partion(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;       // To make place for elements smaller then pivot
        
        for(int j=i;j<ei;j++) {
            if(arr[j]<=pivot) {
                i++;
                // Swap
                int temp = arr[i];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,6,-7,8,2};  // Wrong algorithm
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
