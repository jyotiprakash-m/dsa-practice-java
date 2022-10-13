package string_apna;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = sc.nextLine();

//        Find the lowercase vowels
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);
                count++;
            }
        }
        System.out.println("No of vowles in sentence " + count);
    }
}
