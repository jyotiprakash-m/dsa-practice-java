package array_list;

import java.util.ArrayList;

//  Find the container with most water 
public class PQ1 {
    // Brute force approach O(n^)
    public static int findMaxArea(ArrayList<Integer> height) {
        int area = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i; j < height.size(); j++) {
                int h = Math.min(height.get(i), height.get(j));
                int w = j-i;
                int currArea = h * w;
                area = Math.max(area, currArea);
            }
        }

        return area;
    }

//    2 pointer approach O(n)
    public static int findMaxArea2(ArrayList<Integer> height) {
        int area = 0;
        int lp = 0;
        int rp=height.size()-1;
        
        while(lp!=rp) {
            int h = Math.min(height.get(lp), height.get(rp));
            int w = rp-lp;
            int currArea = h * w;
            area = Math.max(area, currArea);
            if(height.get(lp)<height.get(rp)) {
                lp++;
            }else {
                rp--;
            }
        }

        return area;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(3);
        height.add(4);
        height.add(7);
        height.add(3);
        height.add(5);
        height.add(6);
        System.out.println(findMaxArea(height));
        System.out.println(findMaxArea2(height));
    }
}
