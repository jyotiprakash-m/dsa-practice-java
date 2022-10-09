package mix;

public class Test {
    public static boolean isPalindrome(String s) {
        if (s != null) {
            s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            if (result.equals(s)) {
                return true;
            } else {
                return false;
            }
        }
        if (s.equals("")) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = null;
        System.out.println("Result: " + isPalindrome(s));

    }
}
