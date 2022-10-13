package string_apna;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbccdd";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            result += str.charAt(i);
            if (count > 1) {
                result += count.toString();
            }
        }
        System.out.println("Compressed String: " + result);
    }
}
