package greedy_algorithm;

import java.util.Arrays;
import java.util.Comparator;

// values and weight are not in sorting.
// Find maximum value.
public class FractionalKnapsack {
	public static int findMaxWeight(int[] val, int[] weight, int w) {
		int finalValue = 0;
//		0 column - index | 1 column - ratio = value/weight;
		double[][] ratio = new double[val.length][2];

		for (int i = 0; i < val.length; i++) {
			ratio[i][0] = i;
			ratio[i][1] = val[i] / (double) weight[i];
		}

//		Sorting the ratio by 2nd column

		Arrays.sort(ratio, Comparator.comparingDouble(O -> O[1])); // Ascending order

//		But requirement is in descending order
		int capacity = w;

		for (int i = ratio.length - 1; i >= 0; i--) {
			System.out.println(capacity);
			int idx = (int) ratio[0][0];
			if (capacity >= weight[idx]) {
//				Include full item
				finalValue += val[idx];
				capacity -= weight[idx];
			} else {
//				Include fractional item
				finalValue += (int) (capacity * ratio[i][1]);
				capacity = 0;
				break;
			}
		}
		return finalValue;
	}

	public static void main(String[] args) {
		int[] val = { 60, 100, 120 };
		int[] weight = { 10, 20, 30 };
		int w = 60;
		System.out.println(findMaxWeight(val, weight, w));

	}
}
