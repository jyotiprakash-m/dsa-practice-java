package backtracking;

public class Permutation {
    public static void findPermutation(String str, String ans) { // O(n*n!)
        // Base case
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }
        
        for(int i=0;i<str.length();i++) {
            // Get the current character
            char c = str.charAt(i);
            
            String newStr = str.substring(0,i)+str.substring(i+1);
            findPermutation(newStr, ans+c);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}