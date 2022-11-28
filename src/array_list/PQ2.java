package array_list;

import java.util.ArrayList;

// Find if any pair in a sorted ArrayList has a target sum.
public class PQ2 {
    // Brute force approach - O(n^2)
    public static boolean findPairOfSum(ArrayList<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(i);
            for (int j = i; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    System.out.println(j);
                    return true;
                }
            }
        }

        return false;
    }

//    2 pointer approach - O(n)
    public static boolean findPairOfSum2(ArrayList<Integer> nums, int target) {
        int lp = 0;
        int rp = nums.size() - 1;
        while (lp != rp) {
            if (nums.get(lp) + nums.get(rp) == target) {
                System.out.println(lp+" "+rp);
                return true;
            }
            if (nums.get(lp) + nums.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        System.out.println(findPairOfSum(nums, 8));
        System.out.println(findPairOfSum2(nums, 8));
    }
}
