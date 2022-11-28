package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Frequency is more then n/3
public class MajorityElement { // O(n)
    public static ArrayList<Integer> findMajorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
//            if (map.containsKey(num)) {
//                map.put(num, map.get(num) + 1);
//            } else {
//                map.put(num, 1);
//            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 5, 1, 3,3, 1, 5, 1,3 };
        ArrayList<Integer> result = findMajorityElement(nums);
        for (int num : result) {
            System.out.println(num);
        }
    }
}
