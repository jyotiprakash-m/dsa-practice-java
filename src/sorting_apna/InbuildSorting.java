package sorting_apna;

import java.util.Arrays;
import java.util.Collections;

public class InbuildSorting {
    public static void main(String[] args) {
//        int[] arr = { 5, 4, 3, 1, 2 };
        Integer[] arr = { 5, 4, 3, 1, 2 };
//        Ascending order
//        Arrays.sort(arr,2,arr.length);
//        Descending order 
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
