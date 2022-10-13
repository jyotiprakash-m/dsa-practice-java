package string_apna;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Basic {
    public static void getAllCharecter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void numberOfVowles(String str) {
        Character[] v = { 'a', 'e', 'i', 'o', 'u' };
        Set<Character> vowles = new HashSet<>(Arrays.asList(v));
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vowles.contains(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("Number of vowles " + count);

    }

    public static boolean isPalindrone(String str) {
//        Condition for not a palindrone
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("You type: " + name);
        String a = "jyoti"; // String pooling
        String b = "jyoti";
        String c = new String("racecar");
//        System.out.println(a == c);

        getAllCharecter(c);
        System.out.println();
        numberOfVowles(a);
        System.out.println(isPalindrone(c));
    }

}
