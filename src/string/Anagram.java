package string;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
//        if(s.length() != t.length()) {
//            return false;
//        }
//        https://leetcode.com/problems/valid-anagram/solutions/66722/simple-java-4ms-solution/?orderBy=most_votes&languageTags=java

        char[] ss = s.toCharArray();
        char[] tt = s.toCharArray();
        int[] map = new int[127];
        int count = 0;
        for (int i = 0; i < ss.length; i++) {
            System.out.println("--> " + ss[i]);
            System.out.println(map[ss[i]]);
        }
    }
}
