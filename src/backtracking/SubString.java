package backtracking;

public class SubString {
    public static void findSubString(String str,String ans,int i) {
        
        // Base case
        if(i==str.length()) {
            if(ans.length()==0) {
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }
        
        // Yes
        findSubString(str, ans+str.charAt(i), i+1);
        //  No
        findSubString(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubString(str, "", 0);
        
    }
}
