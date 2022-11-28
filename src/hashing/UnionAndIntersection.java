package hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionAndIntersection {
    static class Result {
        int count;
        ArrayList<Integer> intersection;
        HashSet<Integer> union;
        public Result(int count, ArrayList<Integer> intersection) {
            this.count = count;
            this.intersection = intersection;
        }
        public Result(int count, HashSet<Integer> union) {
            this.count = count;
            this.union = union;
        }

    }

    public static Result union(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i :arr1) {
            hs.add(i);
        }
        for(int i:arr2) {
            hs.add(i);
        }
        
        return new Result(hs.size(), hs);
    }
    public static Result intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al  = new ArrayList<>();
        for(int i :arr1) {
            hs.add(i);
        }
        
        for(int i:arr2) {
            if(hs.contains(i)) {
                al.add(i);
                hs.remove(i);
            }
        }
        return new Result(al.size(), al);
        
    }

    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,9,3,2,9,4};
        
        Result u = union(arr1, arr2);
        Result i = intersection(arr1, arr2);
        
        System.out.println(u.count);
        System.out.println(i.count);
    }
}
