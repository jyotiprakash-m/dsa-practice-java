package greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// Find maximum length as well as the chain
public class MaxLengthOfChain {
	static class Result {
		int chainLength;
		ArrayList<Integer> index;

		public Result(int chainLength, ArrayList<Integer> index) {
			this.chainLength = chainLength;
			this.index = index;
		}

	}

	public static Result findMaxLengthOfChain(int[][] pairs) {
//		Sort by the end point
		int[][] modifiedPairs = new int[pairs.length][3];
		for (int i = 0; i < pairs.length; i++) {
			modifiedPairs[i][0] = i;
			modifiedPairs[i][1] = pairs[i][0];
			modifiedPairs[i][2] = pairs[i][1];

		}
		Arrays.sort(modifiedPairs, Comparator.comparingDouble(O -> O[2]));

		ArrayList<Integer> index = new ArrayList<Integer>();
		int chainLength = 1;
		int chainEnd = modifiedPairs[0][2];
		index.add(modifiedPairs[0][0]);
		for (int i = 1; i < modifiedPairs.length; i++) {
			System.out.println(modifiedPairs[i][0]);
			if (modifiedPairs[i][1] > chainEnd) {
				chainLength = chainLength + 1;
				chainEnd = modifiedPairs[i][2];
				index.add(modifiedPairs[i][0]);
			}
		}

		return new Result(chainLength, index);
	}

	public static void main(String[] args) {
		int[][] pairs = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

		Result result = findMaxLengthOfChain(pairs);
//		System.out.println(result.index.get(0));

	}
}
