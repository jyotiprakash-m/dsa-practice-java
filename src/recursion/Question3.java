package recursion;

public class Question3 {
    public static int lengthOfString(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return lengthOfString(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "jyoti";
        System.out.println(lengthOfString(str));

    }
}
