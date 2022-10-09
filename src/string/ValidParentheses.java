package string;

public class ValidParentheses {
    public static boolean isValidParentheses(String s) {
        if (s.length() == 1 || s.length() == 0 || s == null) {
            return false;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i=i+2) {
            if (arr[i] !=arr[i+1]) {
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println("Result: "+ isValidParentheses(s));
    }
}
