package array_2_apna;

public class BinarySearch {
    public static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == value) {
                return mid;
            }
//            Left condition
            if(arr[mid]>value) {
                end = mid-1;
            }
//            Right condition
            if(arr[mid]<value) {
                start = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,10};
        int value = 1;
        System.out.println(value + " is present in index : "+binarySearch(arr, value));

    }
}
