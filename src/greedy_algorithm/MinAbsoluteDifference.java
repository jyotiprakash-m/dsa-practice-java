package greedy_algorithm;

import java.util.Arrays;

public class MinAbsoluteDifference {
	public static int findMinAbsoluteDifference(int[] A, int[] B) {
		int minValue = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			minValue += Math.abs(A[i] - B[i]);
		}
		return minValue;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3 };
		int[] B = { 2, 1, 5 };
		System.out.println("Minimum absilute difference of the pairs: " + findMinAbsoluteDifference(A, B));
	}
}
