package array_2_apna;

public class subArray {
//    Print array 
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

//    O(n^3)
//    Print the sub array
//    Find total number of sub array
//    Find the sum of the sub array
    public static void bruteForceApproach(int[] arr) {
        int totalSubArray = 0;
        int sumOfSubArray = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sumOfSubArray = 0;
                for (int k = i; k <= j; k++) {
                    sumOfSubArray += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println(" ->>>>>> Sum of the sub array is: " + sumOfSubArray);
//                Total number of sub array
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of sub array: " + totalSubArray);
    }

//    O(n^2)
//    Using prefix sum
//    find the maximum sum of the sub array
    public static void prefixSumApproach(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        int[] prefixSum = new int[arr.length];

//       Create the prefix sum array
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }

//      find the maximum sum of the sub array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int currentSum = i == 0 ? prefixSum[j] : prefixSum[j - 1] - prefixSum[j];
                maxValue = Math.max(maxValue, currentSum);
            }
        }

        System.out.println("Maximum sum of the subarray is: " + maxValue);
    }

//    kadane's algorithm
//    O(n)
    public static void kadaneAlgorithm(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        int currSum = 0;
//        Traverse each elements of the array
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
          
            if (currSum < 0) {
                currSum = 0;
            }
            maxValue = Math.max(maxValue, currSum);
        }
        System.out.println("Max value of the subarray: " + maxValue);
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
//        bruteForceApproach(arr);
        prefixSumApproach(arr);
        kadaneAlgorithm(arr);
    }
}
