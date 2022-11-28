package greedy;

public class Q1 {
    public static int maxBalancedStringPartitions(String str) {
        int size = str.length();
        int ans = 0;
        int L = 0, R = 0;

        for (int i = 0; i < size; i++) {
            if (str.charAt(i) == 'L') {
                L++;
            } else {
                R++;
            }

            if (L == R) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        System.out.println("Number of substring " + maxBalancedStringPartitions(str));
    }

}
