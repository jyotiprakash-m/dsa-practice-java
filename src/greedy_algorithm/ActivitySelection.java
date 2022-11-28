package greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
	static class Result {
		public int maxActivity;
		public ArrayList<Integer> indexs;

		public Result(int maxActivity, ArrayList<Integer> indexs) {
			this.maxActivity = maxActivity;
			this.indexs = indexs;
		}

	}

// If end time is in sorted
	public static Result findActivities(int[] start, int[] end) {
		int maxAct = 0;
		ArrayList<Integer> indexs = new ArrayList<>();

//		First Activities
		maxAct = 1;
		indexs.add(0);
		int lastEnd = end[0];
		for (int i = 1; i < end.length; i++) {
			if (start[i] >= lastEnd) {
				maxAct++;
				indexs.add(i);
				lastEnd = end[i];
			}
		}

		return new Result(maxAct, indexs);
	}

	// If the end time is not sorted then . We will use 2D array O(nlogn)
	public static Result findActivities2(int[] start, int[] end) {
		int activities[][] = new int[start.length][3];
//		0 index - index , 1 index - start time , 2 index - end time
		for (int i = 0; i < start.length; i++) {
			activities[i][0] = i;
			activities[i][1] = start[i];
			activities[i][2] = end[i];
		}

		int maxAct = 0;
		ArrayList<Integer> indexs = new ArrayList<>();

//		Sorting on the basic of end index
		Arrays.sort(activities, Comparator.comparingDouble(O -> O[2]));

//		First Activities
		maxAct = 1;
		indexs.add(activities[0][0]);
		int lastEnd = activities[0][2];
		for (int i = 1; i < end.length; i++) {
			if (activities[i][1] >= lastEnd) {
				maxAct++;
				indexs.add(activities[i][0]);
				lastEnd = activities[i][2];
			}
		}
		return new Result(maxAct, indexs);
	}

	public static void main(String[] args) {
		int start[] = { 3, 1, 0, 5, 5, 8 };
		int end[] = { 4, 2, 6, 7, 9, 9 }; // End time based sorted
		Result r = findActivities2(start, end);
//		System.out.println(r.maxActivity);
		for (int i = 0; i < r.indexs.size(); i++) {
			System.out.println(r.indexs.get(i));
		}

	}
}
