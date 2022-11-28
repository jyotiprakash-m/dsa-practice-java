package recursion;

import java.util.HashMap;
import java.util.Map;

public class Question2 {
    public static String numToString(char c) {
        Map<Character, String> numbers = new HashMap<>();
        numbers.put('0', "zero");
        numbers.put('1', "one");
        numbers.put('2', "two");
        numbers.put('3', "three");
        numbers.put('4', "four");
        numbers.put('5', "five");
        numbers.put('6', "six");
        numbers.put('7', "seven");
        numbers.put('8', "eight");
        numbers.put('9', "nine");
        return numbers.get(c);
    }
    
    public static void convertNumberToString(StringBuilder res,String number,int i) {
        if(i==number.length()) {
            return;
        }
        res.append(numToString(number.charAt(i)));
        res.append(" ");
        convertNumberToString(res, number, i+1);
        
        System.out.println(res);
    }
    public static void main(String[] args) {
        Integer number = 1947;
        convertNumberToString(new StringBuilder(),number.toString(), 0);
    }
}
