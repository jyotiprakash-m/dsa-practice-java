package recursion;

public class RemoveDuplicateString {
    public static void removeDuplicateString(String str, int idx, StringBuilder newString, boolean map[]) {
//        Base case = Stop when you reach end of the string
        if (idx == str.length())
            return;
        System.out.println(newString);
        char currChar = str.charAt(idx);

        if (map[currChar - 'a']) {
            removeDuplicateString(str, idx + 1, newString, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicateString(str, idx + 1, newString.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        String str = "jyotiprakashmohanta";

//        Direct object declaration
        removeDuplicateString(str, 0, new StringBuilder(""), new boolean[26]);
    }

}
