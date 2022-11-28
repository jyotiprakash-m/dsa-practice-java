package array_list;

import java.util.ArrayList;

//Find if any pair in a sorted and rotated ArrayList has a target sum.
public class PQ3 {
//  2 pointer approach - O(n)
    public static boolean findPairOfSum(ArrayList<Integer> nums, int n, int target) {

        int pp = 0;
        // Find out the pivot point
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                pp = i;
                break;
            }
        }

        int lp = pp + 1;
        int rp = pp;
        while (lp != rp) {
            if (nums.get(lp) + nums.get(rp) == target) {
                System.out.println(lp+" "+rp);
                return true;
            }
            if (nums.get(lp) + nums.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(1);
        nums.add(3);
        nums.add(3);
        nums.add(4);
        System.out.println(findPairOfSum(nums,nums.size(), 8));
    }
}
