package array_list;

import java.util.ArrayList;

//  Monotonic ArrayList
public class Q1 {
    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i<nums.size()-1;i++) {
            if(nums.get(i)>nums.get(i+1)) {
                inc = false;
            }
            if(nums.get(i)<nums.get(i+1)) {
                dec = false;
            }
        }

        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(3);
        nums1.add(3);
        nums1.add(4);
        nums1.add(5);
        nums1.add(6);
        nums1.add(7);
        System.out.println(isMonotonic(nums1));
    }
}
