package divide_and_conqrue;

public class MergeSort {
    public static void printArray(int arr[]) {
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        // Idx for 1st sorted part
        int i = si;
        // Idx for 2nd sorted part
        int j = mid + 1;
        // Idx for temporary array
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
        }

        // For leftover elements of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // For leftover elements of 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int[] arr = {3,1,6,-7,8,2};
        printArray(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.println();
        printArray(arr);
    }
}
