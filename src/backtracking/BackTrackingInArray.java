package backtracking;

public class BackTrackingInArray {
    public static void changeArr(int[] arr,int i,int val) {
        if(i==arr.length) {
            printArr(arr);
            return;
        }
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }

    public static void printArr(int[] arr) {
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
